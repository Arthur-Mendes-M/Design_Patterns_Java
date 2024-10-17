package Behavioral_Patterns.state_16.using_pattern;

// State interface
interface State {
    void handle(Context context);
}

// Concrete State 1
class State1 implements State {
    @Override
    public void handle(Context context) {
        System.out.println("State1: Performing action 1");
        context.setState(new State2()); // Change state to State2
    }
}

// Concrete State 2
class State2 implements State {
    @Override
    public void handle(Context context) {
        System.out.println("State2: Performing action 2");
        context.setState(new State1()); // Change state back to State1
    }
}

// Context class
class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        state.handle(this);
    }
}

// Client
public class App {
    public static void main(String[] args) {
        Context context = new Context(new State1());

        context.request(); // Output: State1: Performing action 1
        context.request(); // Output: State2: Performing action 2
        context.request(); // Output: State1: Performing action 1
    }
}
