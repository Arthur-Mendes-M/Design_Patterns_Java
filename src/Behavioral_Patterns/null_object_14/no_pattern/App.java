package Behavioral_Patterns.null_object_14.no_pattern;

interface Animal {
    void makeSound();
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

public class App {
    public static void main(String[] args) {
        Animal dog = getAnimal("Dog");
        if (dog != null) {
            dog.makeSound(); // Output: Woof!
        } else {
            System.out.println("No animal found.");
        }

        Animal unknown = getAnimal("Unknown");
        if (unknown != null) {
            unknown.makeSound();
        } else {
            System.out.println("No animal found."); // Output: No animal found.
        }
    }

    public static Animal getAnimal(String type) {
        if ("Dog".equalsIgnoreCase(type)) {
            return new Dog();
        }
        return null;
    }
}
