public class EvenDigits {

    public static void main(String[] args) {

        int arr[] = { 12, 345, 2, 6, 7896 };
        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] arr) {

        int even = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] + "").length() % 2 == 0) {
                even++;
            }
        }

        return even;
    }
}