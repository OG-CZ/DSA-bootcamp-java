import java.util.Scanner;

public class Q25_LoopOfSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Enter number to sum (Press 0 to Exit): ");
            int num = in.nextInt();
            if (num == 0) break;
            sum += num;
        }
        System.out.println("Total Sum: " + sum);
        in.close();
    }
}
