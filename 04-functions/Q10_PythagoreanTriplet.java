import java.util.Arrays;

public class Q10_PythagoreanTriplet {
    public static void main(String[] args) {
        System.out.println(pythagoreanTriplet(5, 3, 4));
    }

    static String pythagoreanTriplet(int num1, int num2, int num3) {
        int[] arr = {num1, num2, num3};
        Arrays.sort(arr);

        double sum = Math.pow(arr[0], 2) + Math.pow(arr[1], 2);
        return (sum == Math.pow(arr[2], 2)) ? "Pythagorean" : "Not Pythagorean";
    }
}
