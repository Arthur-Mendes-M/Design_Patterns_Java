package Behavioral_Patterns.template_method_17.using_pattern;

abstract class DataProcessor {
    // Template method
    public final void processData() {
        readData();
        processDataDetails();
        saveData();
    }

    protected abstract void readData(); // Steps to be implemented by subclasses

    protected abstract void processDataDetails(); // Steps to be implemented by subclasses

    private void saveData() {
        System.out.println("Saving processed data");
    }
}

// Concrete class for CSV processing
class CSVDataProcessor extends DataProcessor {
    @Override
    protected void readData() {
        System.out.println("Reading CSV data");
    }

    @Override
    protected void processDataDetails() {
        System.out.println("Processing CSV data");
    }
}

// Concrete class for XML processing
class XMLDataProcessor extends DataProcessor {
    @Override
    protected void readData() {
        System.out.println("Reading XML data");
    }

    @Override
    protected void processDataDetails() {
        System.out.println("Processing XML data");
    }
}

// Client
public class App {
    public static void main(String[] args) {
        DataProcessor csvProcessor = new CSVDataProcessor();
        csvProcessor.processData(); // Output: Reading CSV data / Processing CSV data / Saving processed data

        DataProcessor xmlProcessor = new XMLDataProcessor();
        xmlProcessor.processData(); // Output: Reading XML data / Processing XML data / Saving processed data
    }
}

