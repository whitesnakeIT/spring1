package pl.coderslab;

public class TwitterService implements NotificationService{
    @Override
    public void send() {
        System.out.println("Sending twitter");
    }
}
