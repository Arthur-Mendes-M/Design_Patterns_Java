package Structural_Patterns.composite_21.no_pattern;

// Leaf class
class Leaf {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    public void operation() {
        System.out.println("Leaf: " + name);
    }
}

// Client code without Composite Pattern
public class App {
    public static void main(String[] args) {
        Leaf leaf1 = new Leaf("Leaf 1");
        Leaf leaf2 = new Leaf("Leaf 2");

        leaf1.operation(); // Output: Leaf: Leaf 1
        leaf2.operation(); // Output: Leaf: Leaf 2
    }
}

