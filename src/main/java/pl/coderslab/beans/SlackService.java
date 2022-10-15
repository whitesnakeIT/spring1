package pl.coderslab.beans;

import pl.coderslab.beans.MessageService;

public class SlackService implements MessageService {
    @Override
    public void send() {
        System.out.println("Sending slack");
    }

    @Override
    public void send(String message) {

    }
}
