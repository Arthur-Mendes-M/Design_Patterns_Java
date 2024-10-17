package Behavioral_Patterns.mediator_12.no_pattern;

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(User receiver, String message) {
        System.out.println(this.name + " sends message to " + receiver.getName() + ": " + message);
    }

    public String getName() {
        return name;
    }
}

public class App {
    public static void main(String[] args) {
        User john = new User("John");
        User jane = new User("Jane");
        
        john.sendMessage(jane, "Hello, Jane!"); // Output: John sends message to Jane: Hello, Jane!
        jane.sendMessage(john, "Hi, John!");    // Output: Jane sends message to John: Hi, John!
    }
}
