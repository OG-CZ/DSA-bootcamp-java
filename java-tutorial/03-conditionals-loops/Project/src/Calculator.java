import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter operator (+,-,*,/): ");
        char operator = in.next().trim().charAt(0);
        if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
            System.out.println("input two numbers");
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            int ans = 0;

            if (operator == '+') {
                ans = num1 + num2;
            } else if (operator == '-') {
                ans = num1 - num2;
            } else if (operator == '*') {
                ans = num1 * num2;
            } else {
                ans = num1 / num2;
            }
            System.out.println(ans);
        } else {
            System.out.println("Unavailable Operator!");
        }
        in.close();
    }
}
