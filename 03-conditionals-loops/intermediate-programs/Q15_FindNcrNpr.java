public class Q15_FindNcrNpr {
    public static void main(String[] args) {
        int n = 5, r = 2;

        int nPr = factorial(n) / factorial(n - r);
        int nCr = factorial(n) / (factorial(r) * factorial(n - r));

        System.out.println("nPr = " + nPr);
        System.out.println("nCr = " + nCr);
    }

    static int factorial(int num) {
        int result = 1;
        while (num > 0) result *= num--;
        return result;
    }
}
