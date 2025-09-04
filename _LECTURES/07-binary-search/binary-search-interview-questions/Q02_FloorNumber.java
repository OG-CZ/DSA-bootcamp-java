public class Q02_FloorNumber {
    public static void main(String[] args) {

        int target = 3;
        int arr[] = { 2, 4, 5, 9, 14, 16, 18 };

        System.out.println(floor(arr, target));
    }

    static int floor(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int middle = 0;

        // error if target is lesser than the first index value
        if (target < arr[0]) {
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

        return arr[end];
    }
}
