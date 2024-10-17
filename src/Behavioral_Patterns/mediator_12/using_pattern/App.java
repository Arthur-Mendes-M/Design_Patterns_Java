package Behavioral_Patterns.mediator_12.using_pattern;

import java.util.ArrayList;
import java.util.List;

// Mediator interface
interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}

// Concrete Mediator
class ChatRoom implements ChatMediator {
    private List<User> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User sender) {
        for (User user : users) {
            if (user != sender) {
                user.receiveMessage(message);
            }
        }
    }
}

// Colleague class
class User {
    private String name;
    private ChatMediator mediator;

    public User(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void sendMessage(String message) {
        System.out.println(this.name + " sends: " + message);
        mediator.sendMessage(message, this);
    }

    public void receiveMessage(String message) {
        System.out.println(this.name + " received: " + message);
    }
}

// Client
public class App {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User john = new User("John", chatRoom);
        User jane = new User("Jane", chatRoom);
        User alice = new User("Alice", chatRoom);

        chatRoom.addUser(john);
        chatRoom.addUser(jane);
        chatRoom.addUser(alice);

        john.sendMessage("Hello, everyone!"); 
        // Output:
        // John sends: Hello, everyone!
        // Jane received: Hello, everyone!
        // Alice received: Hello, everyone!
    }
}

