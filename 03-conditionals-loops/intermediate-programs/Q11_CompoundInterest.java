public class Q11_CompoundInterest {
    public static void main(String[] args) {
        int p = 12000;
        double r = 0.03;
        int n = 365;
        int t = 10;

        double a = p * Math.pow((1.0 + (r / n)), (n * t));
        System.out.println(a);
    }
}
