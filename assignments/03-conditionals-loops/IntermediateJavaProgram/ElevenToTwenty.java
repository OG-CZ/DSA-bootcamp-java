
import java.util.Arrays;

public class ElevenToTwenty {
    public static void main(String[] args) {
        
        compoundInterest(12_000, 0.03, 365, 10);
        averageMarks(new int[] {80, 85, 90, 100, 95});
        sumOfNumbers(new int[] {5, 5, 5, 5, 5});
        armstrongNumber(153);
    }

    static void compoundInterest(int p, double  r, int n, int t) {
        double a = (double) p * (Math.pow((1.0 + ((double) r / n)), (n * t)));
        System.out.println(a);
    }

    static void averageMarks(int mark[]) {
        int arr[] = new int[mark.length];
        int sum = 0;
        int length = mark.length - 1;
        for (int i : mark) {
            sum += i;
            arr[length] = i;
            length--;
        }
        System.out.println("Average of " + Arrays.toString(arr) + " is " + sum / mark.length);
    }

    static void sumOfNumbers(int num[]) {
        int sum = 0;
        for (int i : num) {
            sum += i;
        }
        System.out.println(sum);
    }

    static void armstrongNumber(int num) {
        int length = Integer.toString(num).length();
        
        int check = num;
        int mod = 1;
        double result = 1;
        int armstrongNumber = 0;
        while (num != 0) {
            mod = num % 10; // get current number's last digit
            num /= 10; // remove last digit
            result = (int) Math.pow(mod, length);
            armstrongNumber += result;
        }
        if (check == armstrongNumber) System.out.println("it is a armstrong");
        else System.out.println("not a armstrong");
    }

    static void findNcrNpr() {
        
    }

}

