package service;

public class NotificationService {

    public void sendNotification(String receiver, String message) {

        System.out.println("=================================");
        System.out.println("Notification Sent");
        System.out.println("Receiver : " + receiver);
        System.out.println("Message  : " + message);
        System.out.println("=================================");

    }

}
