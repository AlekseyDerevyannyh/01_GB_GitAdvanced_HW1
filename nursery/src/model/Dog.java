package model;

import java.util.List;

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }

    public Dog(String name, List<String> commands) {
        super(name, commands);
    }
}
