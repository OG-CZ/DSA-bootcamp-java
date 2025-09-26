public class Q08_RBS {
    // https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/1767767162/
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(findPivot(arr));
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        // if you did not ifnd a pivot, it menas the array is not rotated
        if (pivot == -1)
            // just do normal binary search
            return binarySearch(nums, target, 0, nums.length - 1);

        // if pivot is found, you have found 2 asc sorted arrays
        //
        if (nums[pivot] == target)
            return pivot;

        if (target >= nums[0])
            return binarySearch(nums, target, 0, pivot - 1);

        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int binarySearch(int[] nums, int target, int start, int end) {

        while (start <= end) {

            int middle = start + (end - start) / 2;

            if (target < nums[middle]) {
                end = middle - 1;
            } else if (target > nums[middle]) {
                start = middle + 1;
            } else {
                // answer found
                return middle;
            }

        }

        // return -1 if while loop -> answer not found
        return -1;
    }

    // this wil not work for duplicate values
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1])
                return mid;

            if (mid > start && arr[mid] < arr[mid - 1])
                return mid - 1;

            if (arr[mid] <= arr[start])
                end = mid - 1;
            else
                start = mid + 1;

        }

        return -1;
    }
}
