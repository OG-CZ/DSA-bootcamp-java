public class Q03_AverageOfNumbers {
    public static void main(String[] args) {
        int[] numbers = {8, 2, 6, 4, 5};
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        int average = sum / numbers.length;
        System.out.println(average);
    }
}
