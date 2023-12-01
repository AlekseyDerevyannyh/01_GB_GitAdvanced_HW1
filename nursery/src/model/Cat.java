package model;

import java.util.List;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    public Cat(String name, List<String> commands) {
        super(name, commands);
    }
}
