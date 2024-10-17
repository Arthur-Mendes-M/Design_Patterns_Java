package Behavioral_Patterns.visitor_18.using_pattern;

// Visitor interface
interface Visitor {
    void visit(Circle circle);
    void visit(Square square);
}

// Element classes
class Circle {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class Square {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

// Concrete Visitor
class ShapeDrawer implements Visitor {
    @Override
    public void visit(Circle circle) {
        System.out.println("Drawing a Circle using Visitor");
    }

    @Override
    public void visit(Square square) {
        System.out.println("Drawing a Square using Visitor");
    }
}

// Client
public class App {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();

        ShapeDrawer drawer = new ShapeDrawer();

        // Accepting the visitor
        circle.accept(drawer); // Output: Drawing a Circle using Visitor
        square.accept(drawer); // Output: Drawing a Square using Visitor
    }
}
