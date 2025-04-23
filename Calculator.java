import java.util.Scanner;

public class Calculator {

    public static void  main (String[] args) {
        Scanner input = new Scanner(System.in);
        double number1, number2, result;
        char operator;
        
        System.out.print("Enter the first number: ");
        number1 = input.nextDouble();
        
        System.out.print("Enter the second number: ");
        number2 = input.nextDouble();
        
        System.out.print("Enter an operator (+, -, *, /): ");
        operator = input.next().charAt(0);
        input.close();
        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;
            case '/':
                if (number2 == 0) {
                    System.out.println("Error:  by zero");
                } 
                else {
                    result = number1 / number2;
                    System.out.println(number1 + " / " + number2 + " = " + result);
                }
                break;
            default:
                System.out.println("Invalid operator! Please use +, -, *, or /.");
                break;
        }
    }
}
