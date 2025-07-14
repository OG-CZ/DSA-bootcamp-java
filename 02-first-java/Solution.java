
public class Solution {

    public static void main(String[] args) {
        System.out.println("Write a program to print whether a number is even or odd, also take input from the user.");
        Solution.OddOrEven(-3);

        System.out.println("Take name as input and print a greeting message for that particular name.");
        greetings("ogcreate");

        System.out.println(
                "Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.");
        simpleInterest(1200, 4, 5);

        System.out.println(
                "Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)");
        fakeCalcu(2, 2, "+");

        System.out.println("Take 2 numbers as input and print the largest number.");
        largestNum(55, 3);

        System.out.println("Input currency in rupees and output in USD.");
        rupeesToUSD(100);

        System.out.println("To calculate Fibonacci Series up to n numbers.");
        fibonacci(25);

        System.out.println("To find out whether the given String is Palindrome or not.");
        palindrome("ada");
        
    }

    static void OddOrEven(int x) {

        if (x % 2 == 0) {
            System.out.println(x + " is an even number");
            return;
        }

        System.out.println(x + " is an odd number");
    }

    static void greetings(String name) {
        System.out.println(name + ", Welcome Back!");
    }

    static void simpleInterest(int p, int r, int t) {
        System.out.println((p * r * t) / 100);
    }

    static void fakeCalcu(int num1, int num2, String operator) {

        if (operator.equals("/") && num2 == 0) {
            System.out.println("Cannot divide by zero");
        }

        if (operator.equals("+")) {
            System.out.println(num1 + num2);
        } else if (operator.equals("-")) {
            System.out.println(num2 - num1);
        } else if (operator.equals("*")) {
            System.out.println(num1 * num2);
        } else if (operator.equals("/")) {
            System.out.println(num1 / num2);
        } else
            System.out.println(operator + " symbol not found");
    }

    static void largestNum(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is a larger number");
        } else {
            System.out.println(num2 + " is a larger number");
        }
    }

    static void rupeesToUSD(int rupees) {
        System.out.println(rupees * 0.0117);
    }

    static void fibonacci(int num) {

        int n1 = 0, n2 = 1;

        for (int i = 0; i < num; i++) {

            System.out.print(n1 + " ");

            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.println("");
    }

    static void palindrome(String word) {

        char charArr[] = word.toCharArray();

        int index = 0;
        boolean flag = true;
        String reversed = "";

        for (int i = word.length() - 1; i != -1; i--) {
            // System.out.println(charArr[i]);
            reversed += charArr[i];
        }

        while (flag) {

            if (reversed.equals(word)) {
                System.out.println("palindrome");
                flag = false;
            } else {
                System.out.println("not a palindrome");
                flag = false;
            }

            index++;
            if (index == word.length())
                flag = false;
        }

    }
}
