public class Q18_FutureInvestmentValue {
    public static void main(String[] args) {
        int pv = 1000;
        double r = 0.10;
        int n = 5;

        double fv = pv * Math.pow((1.0 + r), n);
        System.out.println(fv);
    }
}
