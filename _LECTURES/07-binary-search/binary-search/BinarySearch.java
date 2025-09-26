public class BinarySearch {

    public static void main(String[] args) {

        System.out.println(binarySearch(new int[] { -12, -153, -2, 4, 15, 16, 28 }, 4));
    }

    // return the index
    // return -1 if it doesnt exist
    static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find middle
            // int mid = (start + end) / 2; // might be possible that (start + end) ->
            // exceeds the range of integer in java?
            int middle = start + (end - start) / 2;

            if (target < arr[middle]) {
                end = middle - 1;
            } else if (target > arr[middle]) {
                start = middle + 1;
            } else {
                // answer found
                return middle;
            }

        }

        // return -1 if while loop not found
        return -1;
    }
}