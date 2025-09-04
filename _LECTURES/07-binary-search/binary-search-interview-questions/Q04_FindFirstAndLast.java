import java.util.Arrays;

public class Q04_FindFirstAndLast {
    public static void main(String[] args) {

        int num[] = { 5, 7, 7, 7, 7, 8, 8, 10 };

        System.out.println(Arrays.toString(searchRange(num, 7)));
    }

    static int[] searchRange(int[] nums, int target) {

        int[] ans = { -1, -1 };

        // check for first occurence if target first
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        // -1 -1 if answer not found
        return ans;
    }

    // this function return index value of target
    static int search(int[] nums, int target, boolean findStartIndex) {

        int ans = -1;

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int middle = start + (end - start) / 2;

            if (target < nums[middle]) {
                end = middle - 1;
            } else if (target > nums[middle]) {
                start = middle + 1;
            } else {
                // potential answer found
                ans = middle;

                if (findStartIndex == true) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
        }
        return ans;
    }
}
