package pl.part2Annotation.main.zad3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.part2Annotation.config.AppConfig;

public class Main03 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Ship ship = context.getBean("blackPearl",Ship.class);
        ship.getCaptain().startSailing();


    }
}
