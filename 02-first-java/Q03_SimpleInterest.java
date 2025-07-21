import java.util.Scanner;

public class Q03_SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("3. Simple Interest Calculator");
        System.out.print("Enter Principal: ");
        int p = in.nextInt();
        System.out.print("Enter Rate: ");
        int r = in.nextInt();
        System.out.print("Enter Time: ");
        int t = in.nextInt();

        int si = (p * r * t) / 100;
        System.out.println("Simple Interest: " + si);
    }
}
