package Behavioral_Patterns.visitor_18.no_pattern;

// Element classes
class Circle {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Square {
    public void draw() {
        System.out.println("Drawing a Square");
    }
}

// Without Visitor Pattern
public class App {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();

        // Perform draw operation directly
        circle.draw(); // Output: Drawing a Circle
        square.draw(); // Output: Drawing a Square
    }
}

