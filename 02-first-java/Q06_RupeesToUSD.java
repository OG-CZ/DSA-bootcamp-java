import java.util.Scanner;

public class Q06_RupeesToUSD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("6. Enter amount in Rupees: ");
        int rupees = in.nextInt();

        double usd = rupees * 0.0117;
        System.out.println("Equivalent in USD: " + usd);
    }
}
