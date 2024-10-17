package Structural_Patterns.adapter_19.no_pattern;

// Existing class with incompatible interface
class OldPrinter {
    public void print(String message) {
        System.out.println("Old Printer: " + message);
    }
}

// Client code that expects a different interface
public class App {
    public static void main(String[] args) {
        OldPrinter oldPrinter = new OldPrinter();
        oldPrinter.print("Hello World!"); // Output: Old Printer: Hello World!
    }
}

