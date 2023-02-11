package com.example.lab6;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateHelper {
    // Giving the delay to the Scheduler in Seconds
    public static long convertEnumToSeconds(ReminderBefore reminderBefore){
        switch (reminderBefore){
            case ONE_DAY -> {
                return 24*60*60;
            }
            case ONE_HOUR -> {
                return 60*60;
            }
            case FIFTEEN_MIN -> {
                return 15*60;
            }
        }

        return -1;
    }

    // Calculate the specific time in seconds for the reminder
    public static long getReminderTimeInSeconds(Date date, long remindBefore){
        long dateInSeconds = (new Date().getTime() - (date.getTime() - remindBefore*1000))/1000;

        System.out.println(dateInSeconds );
        return (dateInSeconds);
    }

    // This is to display as a message in the reminder notification:
    // "One day before the event", "One hour before the event", "15 min before the event"


    }

