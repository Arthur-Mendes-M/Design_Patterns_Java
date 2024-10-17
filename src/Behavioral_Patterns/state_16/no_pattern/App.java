package Behavioral_Patterns.state_16.no_pattern;

class Context {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public void request() {
        if ("State1".equals(state)) {
            System.out.println("State1: Performing action 1");
        } else if ("State2".equals(state)) {
            System.out.println("State2: Performing action 2");
        } else {
            System.out.println("Unknown State");
        }
    }
}

public class App {
    public static void main(String[] args) {
        Context context = new Context();

        context.setState("State1");
        context.request(); // Output: State1: Performing action 1

        context.setState("State2");
        context.request(); // Output: State2: Performing action 2
    }
}
