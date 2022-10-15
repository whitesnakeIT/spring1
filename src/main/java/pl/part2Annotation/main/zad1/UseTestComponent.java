package pl.part2Annotation.main.zad1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UseTestComponent {
    private final TestComponent testComponent;
    @Autowired
    public UseTestComponent(TestComponent testComponent){
        this.testComponent= testComponent;
    }
    public void testDep(){
        testComponent.test();
    }
}
