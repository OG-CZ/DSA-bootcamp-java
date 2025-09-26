public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {

        System.out.println(orderAgnosticBS(new int[] { -12, -153, -2, 4, 15, 16, 28 }, 4));
    }

    static int orderAgnosticBS(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        // find whether array is sorted in ascedning or descending
        boolean isAscending = arr[start] < arr[end]; // true if ascending ( < )

        while (start <= end) {

            int middle = start + (end - start) / 2;

            if (arr[middle] == target) {
                return middle;
            }

            if (isAscending) {
                if (target < arr[middle]) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            } else {
                if (target > arr[middle]) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
        } // return -1 if while loop not found
        return -1;
    }
}