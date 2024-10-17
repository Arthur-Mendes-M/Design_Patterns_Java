package Behavioral_Patterns.null_object_14.using_pattern;

interface Animal {
    void makeSound();
}

// Concrete class for Dog
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

// Null Object class
class NullAnimal implements Animal {
    @Override
    public void makeSound() {
        // No action taken
        System.out.println("No sound.");
    }
}

// Client class
public class App {
    public static void main(String[] args) {
        Animal dog = getAnimal("Dog");
        dog.makeSound(); // Output: Woof!

        Animal unknown = getAnimal("Unknown");
        unknown.makeSound(); // Output: No sound.
    }

    public static Animal getAnimal(String type) {
        if ("Dog".equalsIgnoreCase(type)) {
            return new Dog();
        }
        return new NullAnimal();
    }
}
