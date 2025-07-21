public class Q24_FactorModulo {
    public static void main(String[] args) {
        int num = 24;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
