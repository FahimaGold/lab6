package com.example.lab6;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Date;


public class Lab6Controller {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Lab 6: Demo of ControlsFx Notification");
        ReminderBefore reminderBefore = ReminderBefore.FIFTEEN_MIN;

        Scheduler scheduler = new Scheduler();
        scheduler.createReminder(new Date(), reminderBefore);
    }
}