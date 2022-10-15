package pl.part2Annotation.main.zad3;

import org.springframework.stereotype.Component;


public class Ship {
    private final Captain captain;

    public Captain getCaptain() {
        return captain;
    }

    public Ship(Captain captain) {
        this.captain = captain;
    }
}
