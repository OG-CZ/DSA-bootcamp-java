import java.util.Scanner;

public class Q09_ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("9. Armstrong Numbers Finder");
        System.out.print("Enter start number: ");
        int start = in.nextInt();
        System.out.print("Enter end number: ");
        int end = in.nextInt();

        for (int i = start; i <= end; i++) {
            int num = i, sum = 0;
            int digits = String.valueOf(i).length();

            while (num > 0) {
                int digit = num % 10;
                sum += Math.pow(digit, digits);
                num /= 10;
            }

            if (sum == i) {
                System.out.println(i + " is an Armstrong number");
            }
        }
    }
}
