import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Z_SolutionEasyThree {
    public static void main(String[] args) {

        int ans1mat[][] = {
                { 0, 1 },
                { 1, 0 },
        };

        int ans1target[][] = {
                { 1, 1 },
                { 0, 1 }
        };
        System.out.println(findRotation(ans1mat, ans1target));

        int ans2arr[] = { 2, 7, 11, 15 };
        System.err.println(Arrays.toString(twoSum(ans2arr, 9)));

        System.out.println(Arrays.toString(sumZero(5)));

        int ans4arr[][] = {
                { 3, 6 },
                { 7, 1 },
                { 5, 2 },
                { 4, 8 }
        };
        System.out.println(luckyNumbers(ans4arr));

    }

    static boolean findRotation(int[][] mat, int[][] target) {

        int n = mat.length;
        int first = 0, second = 0, third = 0, fourth = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[n - j - 1][i] == target[i][j]) {
                    first++;
                }

                if (mat[n - i - 1][n - j - 1] == target[i][j]) {
                    second++;
                }

                if (mat[j][n - i - 1] == target[i][j]) {
                    third++;
                }

                if (mat[i][j] == target[i][j]) {
                    fourth++;
                }
            }
        }

        if (first == n * n || second == n * n || third == n * n || fourth == n * n) {
            return true;
        }
        return false;
    }

    static int[] twoSum(int[] nums, int target) {
        // 58 ms runtime
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                // "NOT both i and j equal to 0"
                if (!(i == j) && nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        return nums;
    }

    static int[] sumZero(int n) {
        int arr[] = new int[n];
        int sum = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = i + 1;
            sum += arr[i];
        }

        arr[n - 1] = -1 * sum;

        return arr;
    }

    static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            int col = 0;

            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    col = j;
                }
            }

            boolean flag = true;

            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][col] > min)
                    flag = false;
            }

            if (flag)
                list.add(min);
        }

        return list;
    }

}
