package com.example.lab6;

public class StringHelper {


    public static String displayReminder(ReminderBefore reminderBefore){
        switch (reminderBefore){
            case ONE_DAY -> {
                return "One day";
            }
            case ONE_HOUR -> {
                return "One hour";
            }
            case FIFTEEN_MIN -> {
                return "15 min";
            }
        }

        return "";
    }
}
