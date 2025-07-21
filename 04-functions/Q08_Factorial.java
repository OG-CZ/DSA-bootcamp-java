import java.util.Arrays;

public class Q08_Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    static String factorial(int num) {
        int product = 1;
        int[] factorial = new int[num];
        int count = 0;
        int original = num;

        while (num > 0) {
            factorial[count] = num;
            product *= num;
            num--;
            count++;
        }

        return original + "! = " + Arrays.toString(factorial) + " = " + product;
    }
}
