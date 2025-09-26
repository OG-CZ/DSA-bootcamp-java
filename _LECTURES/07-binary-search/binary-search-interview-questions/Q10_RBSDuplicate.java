public class Q10_RBSDuplicate {
    public static void main(String[] args) {
    }

    static int search(int[] nums, int target) {
        int pivot = findPivotWithDuplicates(nums);
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

    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1])
                return mid;

            if (mid > start && arr[mid] < arr[mid - 1])
                return mid - 1;

            // if elements at middle,start,end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates

                // NOTE: what if these elements at start and end were the pivots??
                // check if start is pivot
                if (arr[start] > arr[start + 1])
                    return start;
                start++;

                // check whether ned is pivot
                if (arr[end] < arr[end - 1])
                    return end - 1;
                end--;
            }
            // left side is sorted, so pivot should be in right hand side
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
