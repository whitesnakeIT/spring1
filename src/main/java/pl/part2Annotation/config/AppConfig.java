package pl.part2Annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import pl.part2Annotation.main.zad3.Captain;
import pl.part2Annotation.main.zad3.Ship;
import pl.part2Annotation.main.zad4.ScopePrototype;
import pl.part2Annotation.main.zad4.ScopeSingleton;


@Configuration
@ComponentScan(basePackages = "pl")
public class AppConfig {

    // bez @Component nad klasa
//    @Bean
//    public HelloWorld world(){
//        return new HelloWorld();
//    }
    @Bean
    public Captain jackSparrow() {
        return new Captain();
    }

    @Bean
    public Ship blackPearl() {
        return new Ship(jackSparrow());
    }

    @Bean
    public ScopeSingleton scopeSingleton() {
        return new ScopeSingleton();
    }
    @Bean
    @Scope(value = "prototype")
    public ScopePrototype scopePrototype() {
        return new ScopePrototype();
    }
}
