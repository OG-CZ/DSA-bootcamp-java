
public class OneToTen {
    public static void main(String[] args) {
        factorial(10);
        electricityBill(400);
        averageOfNumbers(new int[] {8,2,6,4,5});
        discountOfProduct(100, 25);
        distanceBetweenTwoPoints(0, 0, 6, 2);
        commisionPercentage(6.3, 132_000);
        System.out.println(powerOf(2, 5));
        depreciationOfValue(75000, 6000, 90000);
        battingAverage(25, 2);
        calculateCGPA(new int[] {90, 80, 70, 80, 90});

    }

    static void factorial(int num) {
        int min = 1;
        while (num > 0) {
            min *= num;
            num--;
        }
        System.out.println(min);
    } 

    static void electricityBill(int units) {
        //  U denoting the amount of KWh units of electricity consumed

        int totalElectricityBill = 0;
        // if (units <= 100) {
        //     totalElectricityBill = units * 10;
        // } else if (units <= 200) {
        //     totalElectricityBill = (100 * 10) + (units - 100) * 5;
        // } else if (units <= 300) {
        //     totalElectricityBill = (100 * 10) + (100 * 15) + (units - 200) * 20;
        // } else if (units > 300) {
        //     totalElectricityBill = (100 * 10) + (100 * 15) + (100 * 20) + (units - 300) * 25;
        // }

        // System.out.println(totalElectricityBill);

        int[] charges = {10, 15, 20, 25};
        int[] range   = {100, 100, 100, Integer.MAX_VALUE};

        for (int i = 0; i < range.length; i++) {

            if (units <= range[i]) {
                totalElectricityBill = totalElectricityBill + units * charges[i];
                break;
            } else {
                totalElectricityBill = totalElectricityBill + range[i] * charges[i];
                units -= range[i];
            }
        }
        System.out.println(totalElectricityBill);
    }

    static void averageOfNumbers(int[] num) {
        int count = 0;
        int sum = 0;
        for (int i: num) {
            sum += i;
            count++;
        }
        System.out.println(sum / count);
    }

    static void discountOfProduct(double  productPrice, double  discount) {
        discount = discount / 100.0;
        productPrice /= 100.0;
        System.out.println((productPrice - discount) * 100);

    }

    static void distanceBetweenTwoPoints(int x1, int y1, int x2, int y2) {
       double distance = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2),2));
       System.out.println(distance);
    }

    static void commisionPercentage(double  rate, int purchasePrice) {
        double commision = (rate / 100.0) * purchasePrice;
        System.out.println(commision);
    }

    static int powerOf(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        exponent--;
        return powerOf(base, exponent) * 2;

    }

    static void depreciationOfValue(int assetCost, int salvageValue, int hours) {

        double costPerHour = (double) (assetCost - salvageValue) / hours;
        
        double depreciationOfValue = costPerHour * salvageValue;

        System.out.println("Cost per hour : " + costPerHour + " " + "Depreciatation value: " + depreciationOfValue);
    }

    static void battingAverage(int runsScored, int numberOfTimesOut) {
        System.out.println((double) runsScored / numberOfTimesOut);
    }
    
    static void calculateCGPA(int num[]) {

        int sum = 0;
        for (int i : num) {
            sum += i;
        }   
        double average = ((double) sum / num.length) / 10.0; 
        double percentage =  average * 9.5;
        System.out.println(("CGPA = " + average) + " " + percentage) ;

    }
    
    
}
