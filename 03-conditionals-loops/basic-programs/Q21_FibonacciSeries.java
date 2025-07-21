public class Q21_FibonacciSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        for (int i = 0; i < 10; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
