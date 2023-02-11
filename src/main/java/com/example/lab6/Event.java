package com.example.lab6;

import java.util.Date;

public class Event {
    private long idEvent;
    private String eventName;
    private Date date;
    private ReminderBefore reminderBefore;

    public Event(){}

    public Event(long idEvent, String eventName, Date date, ReminderBefore reminderBefore) {
        this.idEvent = idEvent;
        this.eventName = eventName;
        this.date = date;
        this.reminderBefore = reminderBefore;
    }

    public void updateEvent(Event event){
        this.eventName = event.eventName;
        this.date = event.date;
        this.reminderBefore = event.reminderBefore;
        //... Apply the update on Database
    }

    public void deleteEvent(Event event){
        // Delete it from database
    }
    public long getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(long idEvent) {
        this.idEvent = idEvent;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ReminderBefore getReminderBefore() {
        return reminderBefore;
    }

    public void setReminderBefore(ReminderBefore reminderBefore) {
        this.reminderBefore = reminderBefore;
    }
}
