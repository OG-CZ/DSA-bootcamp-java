public class OptimizedEvenDigits {
    public static void main(String[] args) {

        System.out.println(findNumbers(new int[] { 12, 345, 2, 6, 7896 }));
        System.out.println(digits(123456)); // 6
    }

    static int findNumbers(int[] num) {
        int count = 0;
        for (int i : num) {
            if (even(i)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    static int digits(int num) {
        if (num < 0)
            num = num * -1;
        return (int) (Math.log10(num)) + 1;
    }

}
