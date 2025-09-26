public class Q06_PeakIndexInMountainArray {
    // @formatter:off
    public static void main(String[] args) {
        int arr[] = {1,2,4,6,8,5,3};
        System.out.println(peakIndexInMountainArray(arr));
    }

    // https://leetcode.com/problems/peak-index-in-a-mountain-array/
    static int peakIndexInMountainArray(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int middle = start + (end - start) / 2;
            if (nums[middle] > nums[middle + 1]) {
                // you are in decreasing part of the array
                // this maybe answer, but look at left
                // this is why end != mid - 1
                end = middle;
            } else {
                // you are ascending part of the array
                start = middle + 1; // bcs we know tat mid+1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of 2 checks
        // sstart and end are always trying to find th emax element in the above 2 checks
        // hence, when they are potingin to just one elmeent, taht is the max one because that is waht the checks say
        // more elebaoration: at every point of time for start and end, they have th ebst possible answer till that time
        // and if we are saying that only one item is reminaing, hence cus of the above line that is the best possible answer
        return start; // or return end cus both are equal start == end
    }
}
