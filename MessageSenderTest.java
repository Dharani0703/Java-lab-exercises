package Interface;


public interface MessageSender {
 void sendMessage(String message);
}

class EmailMessageSender implements MessageSender {
 @Override
 public void sendMessage(String message) {

     System.out.println("Sending email: " + message);
 }
}

class SmsMessageSender implements MessageSender {
 @Override
 public void sendMessage(String message) {

     System.out.println("Sending SMS: " + message);
 }
}

class PushNotificationSender implements MessageSender {
 @Override
 public void sendMessage(String message) {

     System.out.println("Sending push notification: " + message);
 }
}

public class MessageSenderTest {
 public static void main(String[] args) {

     MessageSender emailSender = new EmailMessageSender();
     MessageSender smsSender = new SmsMessageSender();
     MessageSender pushNotificationSender = new PushNotificationSender();

     emailSender.sendMessage("Hello via Email!");
     smsSender.sendMessage("Hello via SMS!");
     pushNotificationSender.sendMessage("Hello via Push Notification!");
 }
}
