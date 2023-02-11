package com.example.lab6;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;

// Popup Notification to display the reminder
public class Notification {

        private long notificationID;
        private String notificationTitle;
        private String notificationText;

        private Image icon;
        public Notification(){

        }
        public Notification(long notificationID, String notificationTitle, String notificationText) {
            this.notificationID = notificationID;
            this.notificationTitle = notificationTitle;
            this.notificationText = notificationText;
        }
        public void showNotifications(){
            Notifications notifications = Notifications.create();
            this.icon = new Image("/img.png");
            notifications.title(this.notificationTitle)
                    .text(this.notificationText)
                    .graphic(new ImageView(this.icon))
                    .hideAfter(Duration.INDEFINITE)
                    .position(Pos.TOP_RIGHT)
                    .onAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent actionEvent) {
                            System.out.println("Notification clicked!");
                        }
                    });

            // Give the notification Dark Sytle
            notifications.darkStyle();
            notifications.show();


        }

        public long getNotificationID() {
            return notificationID;
        }

        public void setNotificationID(long notificationID) {
            this.notificationID = notificationID;
        }

        public String getNotificationTitle() {
            return notificationTitle;
        }

        public void setNotificationTitle(String notificationTitle) {
            this.notificationTitle = notificationTitle;
        }

        public String getNotificationText() {
            return notificationText;
        }

        public void setNotificationText(String notificationText) {
            this.notificationText = notificationText;
        }
    }


