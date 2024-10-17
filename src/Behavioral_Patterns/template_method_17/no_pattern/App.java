package Behavioral_Patterns.template_method_17.no_pattern;

class DataProcessor {
    public void processData(String dataType) {
        if ("CSV".equalsIgnoreCase(dataType)) {
            // Process CSV data
            System.out.println("Reading CSV data");
            // Additional processing...
            System.out.println("Processing CSV data");
        } else if ("XML".equalsIgnoreCase(dataType)) {
            // Process XML data
            System.out.println("Reading XML data");
            // Additional processing...
            System.out.println("Processing XML data");
        }
        // More data types can be added here
    }
}

public class App {
    public static void main(String[] args) {
        DataProcessor processor = new DataProcessor();
        processor.processData("CSV"); // Output: Reading CSV data / Processing CSV data
        processor.processData("XML");  // Output: Reading XML data / Processing XML data
    }
}

