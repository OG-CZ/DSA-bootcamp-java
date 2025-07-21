public class Q23_FactorNestedLoop {
    public static void main(String[] args) {
        int num = 24;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i * j == num) {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
    }
}
