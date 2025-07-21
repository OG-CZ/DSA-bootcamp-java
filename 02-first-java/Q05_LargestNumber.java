import java.util.Scanner;

public class Q05_LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("5. Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();

        if (a > b) {
            System.out.println(a + " is larger");
        } else {
            System.out.println(b + " is larger");
        }
    }
}
