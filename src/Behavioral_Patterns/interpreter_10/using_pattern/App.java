package Behavioral_Patterns.interpreter_10.using_pattern;

// Define the abstract Expression interface
interface BooleanExpression {
    boolean interpret();
}

// Terminal expression for boolean values (true or false)
class BooleanValue implements BooleanExpression {
    private final boolean value;

    public BooleanValue(boolean value) {
        this.value = value;
    }

    @Override
    public boolean interpret() {
        return value;
    }
}

// Non-terminal expression for AND operation
class AndExpression implements BooleanExpression {
    private final BooleanExpression leftExpression;
    private final BooleanExpression rightExpression;

    public AndExpression(BooleanExpression leftExpression, BooleanExpression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public boolean interpret() {
        return leftExpression.interpret() && rightExpression.interpret();
    }
}

// Non-terminal expression for OR operation
class OrExpression implements BooleanExpression {
    private final BooleanExpression leftExpression;
    private final BooleanExpression rightExpression;

    public OrExpression(BooleanExpression leftExpression, BooleanExpression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public boolean interpret() {
        return leftExpression.interpret() || rightExpression.interpret();
    }
}

// Client
public class App {
    public static void main(String[] args) {
        // true AND (false OR true)
        BooleanExpression expression = new AndExpression(
            new BooleanValue(true),
            new OrExpression(
                new BooleanValue(false),
                new BooleanValue(true)
            )
        );

        System.out.println("Result: " + expression.interpret()); // Output: true
    }
}
