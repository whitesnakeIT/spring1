package pl.coderslab;

public class SmsService implements NotificationService{
    @Override
    public void send() {
        System.out.println("Sending sms");
    }
}
