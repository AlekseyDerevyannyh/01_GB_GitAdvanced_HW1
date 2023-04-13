package model;

import java.util.List;

public class Camel extends PackAnimal {
    public Camel(String name) {
        super(name);
    }

    public Camel(String name, List<String> commands) {
        super(name, commands);
    }
}
