import java.util.Scanner;

public class FibonacciNumber {

    // Q: fIND THE FIBONACCI NTH Number

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = 7;

        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n) {
            int temp = b;
            b = a + b; 
            a = temp; 
            count++;
        }

    }

}
