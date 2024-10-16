package Behavioral_Patterns.command_09.no_pattern;

class CalcOperation {
    public void execSub(float number_one, float number_two) {
        System.out.println("A subtração deu: " + (number_one - number_two));
    }

    public void execSum(float number_one, float number_two) {
        System.out.println("A soma deu: " + (number_one + number_two));
    }
} 

public class App {
    public static void main(String[] args) {
        CalcOperation calculator = new CalcOperation();
        calculator.execSub(10, 5);
        calculator.execSum(10, 5);
    }
}