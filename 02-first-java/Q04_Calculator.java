import java.util.Scanner;

public class Q04_Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("4. Basic Calculator");
        System.out.print("Enter first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();
        System.out.print("Enter operator (+, -, *, /): ");
        String op = in.next();

        if (op.equals("/") && num2 == 0) {
            System.out.println("Cannot divide by zero");
        } else if (op.equals("+")) {
            System.out.println("Result: " + (num1 + num2));
        } else if (op.equals("-")) {
            System.out.println("Result: " + (num1 - num2));
        } else if (op.equals("*")) {
            System.out.println("Result: " + (num1 * num2));
        } else if (op.equals("/")) {
            System.out.println("Result: " + (num1 / num2));
        } else {
            System.out.println("Invalid operator");
        }
    }
}
