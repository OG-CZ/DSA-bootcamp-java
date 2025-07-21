public class Q02_ElectricityBill {
    public static void main(String[] args) {
        int units = 400;
        int totalElectricityBill = 0;

        int[] charges = {10, 15, 20, 25};
        int[] range = {100, 100, 100, Integer.MAX_VALUE};

        for (int i = 0; i < range.length; i++) {
            if (units <= range[i]) {
                totalElectricityBill += units * charges[i];
                break;
            } else {
                totalElectricityBill += range[i] * charges[i];
                units -= range[i];
            }
        }
        System.out.println(totalElectricityBill);
    }
}
