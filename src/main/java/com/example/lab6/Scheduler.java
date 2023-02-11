package com.example.lab6;

import javafx.application.Platform;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;


import static java.util.concurrent.TimeUnit.SECONDS;

public class Scheduler implements IScheduler{

    public Scheduler(){

    }

    // We need only one thread
    private final ScheduledExecutorService scheduler =
            Executors.newScheduledThreadPool(1);


    @Override
    public void createReminder(Date date, ReminderBefore reminderBefore) {
        long reminderBeforeInSeconds = DateHelper.convertEnumToSeconds(reminderBefore);
        long delay = DateHelper.getReminderTimeInSeconds(new Date(),reminderBeforeInSeconds);
        scheduler.schedule(new Runnable() {
            public void run() {
                // By default, threads cannot update UI thread, only the main thread that updates the UI
                // We use Platform.runLater in order to let the mainthread display the reminder
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("Scheduling...");
                        Notification notification = new Notification(1, "Reminder","Your Event is in "
                                + StringHelper.displayReminder (reminderBefore));
                        notification.showNotifications();
                    }
                });

            }
        }, delay, SECONDS);
    }

    @Override
    public void updateReminder(Date date, ReminderBefore reminderBefore) {

    }



}
