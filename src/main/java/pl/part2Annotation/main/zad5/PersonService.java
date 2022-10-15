package pl.part2Annotation.main.zad5;

import org.springframework.stereotype.Component;

@Component
public class PersonService {
    private final PersonRepository personRepository;

    public PersonRepository getPersonRepository() {
        return personRepository;
    }

    public  PersonService (PersonRepository personRepository){

        this.personRepository=personRepository;
    }

}
