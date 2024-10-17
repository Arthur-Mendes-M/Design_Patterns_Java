package Structural_Patterns.composite_21.using_pattern;

import java.util.ArrayList;
import java.util.List;

// Component interface
interface Component {
    void operation();
}

// Leaf class
class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("Leaf: " + name);
    }
}

// Composite class
class Composite implements Component {
    private List<Component> children = new ArrayList<>();

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void operation() {
        System.out.println("Composite:");
        for (Component component : children) {
            component.operation(); // Delegate operation to children
        }
    }
}

// Client code
public class App {
    public static void main(String[] args) {
        Leaf leaf1 = new Leaf("Leaf 1");
        Leaf leaf2 = new Leaf("Leaf 2");

        Composite composite = new Composite();
        composite.add(leaf1);
        composite.add(leaf2);

        composite.operation();
        // Output:
        // Composite:
        // Leaf: Leaf 1
        // Leaf: Leaf 2
    }
}
