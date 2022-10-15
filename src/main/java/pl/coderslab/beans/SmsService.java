package pl.coderslab.beans;

import pl.coderslab.beans.MessageService;

public class SmsService implements MessageService {
    @Override
    public void send() {
        System.out.println("Sending sms");
    }

    @Override
    public void send(String message) {

    }
}
