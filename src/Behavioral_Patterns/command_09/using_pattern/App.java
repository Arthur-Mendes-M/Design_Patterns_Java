package Behavioral_Patterns.command_09.using_pattern;

// What each operation makes
class Operation {
    public void execSub(float number_one, float number_two) {
        System.out.println("A subtração deu: " + (number_one - number_two));
    }

    public void execSum(float number_one, float number_two) {
        System.out.println("A soma deu: " + (number_one + number_two));
    }
} 

// What a command need to do
interface Command {
    void execute();
}

// Define SUM is a command and execute the command passing the numbers recived on constructor
class SumCommand implements Command{
    private Operation operation;
    private float n1;
    private float n2;

    public SumCommand(Operation operation, float n1, float n2) {
        this.operation = operation;
        this.n1 = n1;
        this.n2 = n2;
    }

    @Override
    public void execute() {
        operation.execSum(n2, n1);
    }
}

// The same for SubCommand (not here just to let the code clean)

// Turn a command "invokeable" calling the execute method of command
class Invoke {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        this.command.execute();
    }
}

public class App {
    // Split the calculation COMMAND, the values definition (SumCommand) and the INVOKEtion of calc
    public static void main(String[] args) {
        Operation sumOperation = new Operation();
        SumCommand sum = new SumCommand(sumOperation, 10, 5);

        Invoke sumCalculator = new Invoke();
        sumCalculator.setCommand(sum);

        sumCalculator.executeCommand();
    }
}