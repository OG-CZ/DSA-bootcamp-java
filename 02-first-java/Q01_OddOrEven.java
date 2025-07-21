import java.util.Scanner;

public class Q01_OddOrEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("1. Enter a number: ");
        int x = in.nextInt();

        if (x % 2 == 0) {
            System.out.println(x + " is an even number");
        } else {
            System.out.println(x + " is an odd number");
        }
    }
}
