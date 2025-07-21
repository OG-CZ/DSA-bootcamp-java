public class Q26_SumItAll {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 5, 9, 11, 14, 19, -3, -6, 89, -200, 23, -5};
        sumItAll(numbers);
    }

    static void sumItAll(int[] num) {
        int pos = 0, neg = 0, even = 0, odd = 0;

        for (int n : num) {
            if (n < 0) neg += n;

            if (n > 0 && n % 2 == 0) {
                pos += n;
                even += n;
            }

            if (n > 0 && n % 2 != 0) {
                pos += n;
                odd += n;
            }
        }

        System.out.println("Sum => positive:" + pos + " => negative:" + neg + " => even:" + even + " => odd:" + odd);
    }
}
