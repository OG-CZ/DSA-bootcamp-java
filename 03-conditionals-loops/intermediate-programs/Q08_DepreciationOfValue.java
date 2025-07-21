public class Q08_DepreciationOfValue {
    public static void main(String[] args) {
        int assetCost = 75000;
        int salvageValue = 6000;
        int hours = 90000;

        double costPerHour = (double) (assetCost - salvageValue) / hours;
        double depreciationValue = costPerHour * salvageValue;

        System.out.println("Cost per hour: " + costPerHour + " Depreciation value: " + depreciationValue);
    }
}
