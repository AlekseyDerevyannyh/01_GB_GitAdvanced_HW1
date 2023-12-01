package model;

import java.util.List;

public class Donkey extends PackAnimal {
    public Donkey(String name) {
        super(name);
    }

    public Donkey(String name, List<String> commands) {
        super(name, commands);
    }
}
