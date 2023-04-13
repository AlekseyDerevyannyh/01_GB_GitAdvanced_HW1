package controller;

import model.Animal;
import model.Repository;

import java.util.List;

public class Controller {
    private final Repository repository;

    public Controller(Repository repository) {
        this.repository = repository;
    }

    public void validateAnimalData(Animal animal) {
        if (animal.getName().isEmpty()) {
            throw new IllegalStateException("Fields are empty!");
        }
    }

    public void saveAnimal(Animal animal) {
        validateAnimalData(animal);
        repository.createAnimal(animal);
    }

    public Animal readAnimal(String name) throws Exception {
        List<Animal> animals = repository.getAllAnimals();
        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(name)) {
                return animal;
            }
        }
        throw new Exception("Animal not found!");
    }

    public List<Animal> readAnimals() {
        return repository.getAllAnimals();
    }

    public void editAnimal(Animal animal) {
        validateAnimalData(animal);
        repository.updateAnimal(animal);
    }

    public void deleteAnimal(String name) {
        repository.deleteAnimal(name);
    }
}
