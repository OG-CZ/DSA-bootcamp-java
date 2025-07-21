public class Q07_PowerOf {
    public static void main(String[] args) {
        int base = 2;
        int exponent = 5;
        System.out.println(powerOf(base, exponent));
    }

    static int powerOf(int base, int exponent) {
        if (exponent == 0) return 1;
        return base * powerOf(base, exponent - 1);
    }
}
