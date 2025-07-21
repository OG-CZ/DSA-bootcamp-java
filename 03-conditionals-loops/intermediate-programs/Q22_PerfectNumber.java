import java.util.Arrays;

public class Q22_PerfectNumber {
    public static void main(String[] args) {
        perfectNumber(6);
    }

    static void perfectNumber(int num) {
        int count = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) count++;
        }

        int[] arr = new int[count];
        int sum = 0, index = 0;
        for (int j = 1; j < num; j++) {
            if (num % j == 0) {
                arr[index++] = j;
                sum += j;
            }
        }

        if (sum == num) {
            System.out.println(Arrays.toString(arr) + " = " + sum + " is a perfect number");
        }
    }
}
