package FInterfaceLambdaString;

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class CalculatorLambda {
	
    public static void main(String[] args) {

        Calculator add = (a, b) -> a + b;
        Calculator sub = (a, b) -> a - b;
        Calculator mul = (a, b) -> a * b;
        Calculator div = (a, b) -> a / b;

        System.out.println("Addition: " + add.calculate(20, 10));
        System.out.println("Subtraction: " + sub.calculate(20, 10));
        System.out.println("Multiplication: " + mul.calculate(20, 10));
        System.out.println("Division: " + div.calculate(20, 10));
    }
}

