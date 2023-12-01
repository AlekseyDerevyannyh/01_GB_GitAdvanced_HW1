package model;

import java.util.List;

public class Horse extends PackAnimal {
    public Horse(String name) {
        super(name);
    }

    public Horse(String name, List<String> commands) {
        super(name, commands);
    }
}
