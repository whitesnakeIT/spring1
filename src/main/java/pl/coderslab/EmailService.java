package pl.coderslab;

public class EmailService implements NotificationService{
    @Override
    public void send() {
        System.out.println("Sending email");
    }
}
