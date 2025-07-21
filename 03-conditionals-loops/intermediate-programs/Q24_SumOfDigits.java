public class Q24_SumOfDigits {
    public static void main(String[] args) {
        sumOfDigits(123);
    }

    static void sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}
