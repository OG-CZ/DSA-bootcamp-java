import java.util.Scanner;

public class Q07_Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("7. Enter number of terms: ");
        int num = in.nextInt();

        int n1 = 0, n2 = 1;
        for (int i = 0; i < num; i++) {
            System.out.print(n1 + " ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }
}
