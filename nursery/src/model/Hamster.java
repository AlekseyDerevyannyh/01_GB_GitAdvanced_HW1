package model;

import java.util.List;

public class Hamster extends Pet {
    public Hamster(String name) {
        super(name);
    }

    public Hamster(String name, List<String> commands) {
        super(name, commands);
    }
}
