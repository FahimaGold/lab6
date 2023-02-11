package com.example.lab6;

import java.util.Date;

public interface IScheduler {
    public void createReminder(Date date, ReminderBefore reminderBefore);
    public void updateReminder(Date date, ReminderBefore reminderBefore);
}
