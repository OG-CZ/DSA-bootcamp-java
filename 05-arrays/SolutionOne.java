import java.util.Arrays;

public class SolutionOne {
    public static void main(String[] args) {
        int ans1[] = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(ans1)));
   
        int ans2[][] = {
            {1,3},
            {71,3},
            {3,5}
        }; 
        System.out.println(maximumWealth(ans2));
    }

    static int[] buildArray(int[] nums) {
        int ans[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
    static int maximumWealth(int[][] accounts) {
        
        int max = 0;

        for (int i = 0; i < accounts.length; i++) {
            int temp = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                temp += accounts[i][j];
                if (temp > max) {
                    max = temp;
                }
            }
        }
        
        return max;
    }
}
