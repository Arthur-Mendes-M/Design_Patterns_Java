package Behavioral_Patterns.interpreter_10.no_pattern;

public class App {
    public boolean interpret(String expression) {
        if (expression.equals("true AND false")) {
            return true && false;
        } else if (expression.equals("true OR false")) {
            return true;
        } else {
            throw new UnsupportedOperationException("Expression not supported");
        }
    }

    public static void main(String[] args) {
        App interpreter = new App();
        System.out.println(interpreter.interpret("true AND false")); // Output: false
        System.out.println(interpreter.interpret("true OR false"));  // Output: true
    }
}
