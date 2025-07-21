public class Q06_CommissionPercentage {
    public static void main(String[] args) {
        double rate = 6.3;
        int purchasePrice = 132000;
        double commission = (rate / 100.0) * purchasePrice;
        System.out.println(commission);
    }
}
