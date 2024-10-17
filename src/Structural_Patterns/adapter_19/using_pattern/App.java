package Structural_Patterns.adapter_19.using_pattern;

// Target interface that the client expects
interface Printer {
    void print(String message);
}

// Existing class with an incompatible interface
class OldPrinter {
    public void print(String message) {
        System.out.println("Old Printer: " + message);
    }
}

// Adapter class that adapts OldPrinter to the Printer interface
class OldPrinterAdapter implements Printer {
    private OldPrinter oldPrinter;

    public OldPrinterAdapter(OldPrinter oldPrinter) {
        this.oldPrinter = oldPrinter;
    }

    @Override
    public void print(String message) {
        oldPrinter.print(message); // Delegate the call to OldPrinter
    }
}

// Client code
public class App {
    public static void main(String[] args) {
        OldPrinter oldPrinter = new OldPrinter();
        Printer printer = new OldPrinterAdapter(oldPrinter); // Use the adapter

        printer.print("Hello World!"); // Output: Old Printer: Hello World!
    }
}

