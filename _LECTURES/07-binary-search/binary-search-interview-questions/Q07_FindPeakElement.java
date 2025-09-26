
class Q07_FindPeakElement {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 1 };
        System.out.println(findPeakElement(nums));
    }

    static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int middle = start + (end - start) / 2;
            if (nums[middle] > nums[middle + 1]) {
                end = middle;
            } else {
                start = middle + 1; // bcs we know tat mid+1 element > mid element
            }
        }
        return start;
    }
}
