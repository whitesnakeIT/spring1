package pl.coderslab;

import pl.coderslab.beans.*;

public class Main01 {
    public static void main(String[] args) {

        MessageSender messageSenderSms=new MessageSender(new SmsService());
        MessageSender messageSenderTwitter=new MessageSender(new TwitterService());
        MessageSender messageSenderEmail=new MessageSender(new EmailService());
        MessageSender messageSenderSlack=new MessageSender(new SlackService());
        messageSenderSlack.sendMessage();
          messageSenderSms.sendMessage();
        messageSenderEmail.sendMessage();
        messageSenderTwitter.sendMessage();
    }
}
