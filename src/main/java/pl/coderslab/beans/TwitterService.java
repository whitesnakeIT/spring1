package pl.coderslab.beans;

import pl.coderslab.beans.MessageService;

public class TwitterService implements MessageService {
    @Override
    public void send() {
        System.out.println("Sending twitter");
    }

    @Override
    public void send(String message) {

    }
}
