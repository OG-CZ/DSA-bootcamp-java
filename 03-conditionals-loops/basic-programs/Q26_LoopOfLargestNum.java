import java.util.Scanner;

public class Q26_LoopOfLargestNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int num;

        do {
            System.out.print("Enter number (0 to Exit): ");
            num = in.nextInt();
            if (num > largest && num != 0) {
                largest = num;
            }
        } while (num != 0);

        System.out.println("Largest Number: " + largest);
        in.close();
    }
}
