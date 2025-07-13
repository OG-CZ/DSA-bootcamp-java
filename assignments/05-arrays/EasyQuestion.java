import java.util.Arrays;

public class EasyQuestion {
    public static void main(String[] args) {
        int arr1[] = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(arr1)));
    
        int arr2[] = {0, 5, 0};
        System.out.println(Arrays.toString( concatArray(arr2)));

        int arr3[] = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(arr3)));

    }

    static int[] buildArray(int[] nums) {
        int result[] = new int[nums.length];
        
        for (int i = 0; i < result.length; i++) {
            result[i] = nums[nums[i]];
        }

        return result;
    }

    static int[] concatArray(int[] nums) {
        int ans[] = new int[nums.length * 2];
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = ans[i + n] = nums[i];
        }
        
        return ans;
    }

    //  1 2 3 4
    static int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        sum[0] = nums[0];

        for (int i = 1; i < sum.length; i++) {
            sum[i] = sum[i - 1] + nums[i];
        }
        
        return sum;
    }
}
