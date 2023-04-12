package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
    private final String name;
    private List<String> commands = new ArrayList<>();

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, List<String> commands) {
        this.name = name;
        this.commands = commands;
    }

    private void addCommand(String command) {
        this.commands.add(command);
    }

    public String getName() {
        return name;
    }

    public List<String> getCommands() {
        return commands;
    }
}
