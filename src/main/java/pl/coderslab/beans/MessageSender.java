package pl.coderslab.beans;

import pl.coderslab.beans.MessageService;

public class MessageSender {
    private final MessageService messageService;
    private String message;

    public MessageService getMessageService() {
        return messageService;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MessageSender(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendMessage() {
        messageService.send();
    }

    public void sendMessageFromProperty() {
        messageService.send(message);

    }
}

