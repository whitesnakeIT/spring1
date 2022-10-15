package pl.coderslab;

public class SlackService implements NotificationService{
    @Override
    public void send() {
        System.out.println("Sending slack");
    }
}
