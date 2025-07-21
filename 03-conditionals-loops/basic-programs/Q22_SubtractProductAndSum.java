public class Q22_SubtractProductAndSum {
    public static void main(String[] args) {
        int n = 234;
        int product = 1;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }

        System.out.println(product - sum);
    }
}
