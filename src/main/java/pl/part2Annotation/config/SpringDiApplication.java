package pl.part2Annotation.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.part2Annotation.main.zad1.TestComponent;
import pl.part2Annotation.main.zad1.UseTestComponent;
import pl.part2Annotation.main.zad2.HelloWorld;

public class SpringDiApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        TestComponent bean = context.getBean(TestComponent.class);

        UseTestComponent bean2 = context.getBean((UseTestComponent.class));
 bean.test();
        bean2.testDep();

        HelloWorld bean3 = context.getBean(HelloWorld.class);
        bean3.hello();
    }
}
