package pl.coderslab.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.coderslab.beans.EmailService;
import pl.coderslab.beans.HelloWorld;
import pl.coderslab.beans.MessageSender;

public class SpringDiApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

//        HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);
//      helloWorld.setMessage("my message");
        HelloWorld helloWorld = context.getBean(HelloWorld.class);
        helloWorld.printMessage();
        System.out.println(helloWorld.getMessage());


        // zad 3

        EmailService emailService= context.getBean(EmailService.class);

        emailService.send();

        MessageSender messageSender = context.getBean(MessageSender.class);

        messageSender.sendMessage();

messageSender.sendMessageFromProperty();

        context.close();
    }
}
