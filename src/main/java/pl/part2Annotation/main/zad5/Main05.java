package pl.part2Annotation.main.zad5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.part2Annotation.config.AppConfig;

public class Main05 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


        PersonService person = context.getBean(PersonService.class);
        System.out.println(person.getPersonRepository().getClass().getName());

    }
}
