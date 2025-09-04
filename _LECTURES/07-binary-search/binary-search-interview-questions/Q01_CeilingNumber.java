
public class Q01_CeilingNumber {

    public static void main(String[] args) {

        int target = 18;
        int arr[] = { 2, 3, 5, 9, 14, 16, 18 };

        System.out.println(ceiling(arr, target));
    }

    static int ceiling(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int middle = 0;

        // error if the target is greater than the last element
        if (target > arr[arr.length - 1]) {
            return -1;
        }

        while (start <= end) {
            middle = start + (end - start) / 2;

            if (target == arr[middle])
                return arr[middle];
            else if (target < arr[middle]) {
                end = middle - 1;
            } else if (target > arr[middle]) {
                start = middle + 1;
            }
        }

        return arr[start];
    }
}
