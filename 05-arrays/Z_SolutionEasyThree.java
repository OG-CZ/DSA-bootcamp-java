import java.util.ArrayList;
import java.util.Arrays;
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

        int ans5arr[] = { 1, 2, 3, 4 };
        System.out.println(maxSubArray(ans5arr));

        int ans6arr[][] = {
                { 1, 2 },
                { 3, 4 }
        };

        for (int[] is : matrixReshape(ans6arr, 1, 4)) {
            System.out.println(Arrays.toString(is));
        }

        int ans7arr[] = { 4, 9, 99, 999, 9, 9 };
        System.out.println(Arrays.toString(plusOne(ans7arr)));

        int ans8arr[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(removeDuplicates(ans8arr));

        int ans9arr[] = { 1, 2, 3 };
        System.out.println(minCostToMoveChips(ans9arr));

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

    /*
     * int prev = Integer.MIN_VALUE;
     * 
     * for (int i = 0; i < nums.length; i++) {
     * int sum = 0;
     * for (int j = i; j < nums.length; j++) {
     * sum += nums[j];
     * if (sum > prev) {
     * prev = sum;
     * }
     * }
     * }
     */
    static int maxSubArray(int[] nums) {
        // 1 2 3 4

        int maxSum = nums[0]; // Start with the first element
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Either extend the current subarray or start a new one at nums[i]
            currentSum = Math.max(nums[i], currentSum + nums[i]); // tracks what you're building NOW
            maxSum = Math.max(maxSum, currentSum); // remembers the BEST you've seen so far
        }

        return maxSum;
    }

    static int[][] matrixReshape(int[][] mat, int r, int c) {

        int m = mat.length;
        int n = mat[0].length;

        int arr[][] = new int[r][c];
        int vector[] = new int[m * n];

        int index = 0;

        if (m * n != r * c)
            return mat;

        for (int i[] : mat) {
            for (int j : i) {
                vector[index++] = j;
            }
        }

        index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = vector[index++];
            }
        }
        return arr;
    }

    /*
     * Optimized way
     * public int[][] matrixReshape(int[][] mat, int r, int c) {
     * int m = mat.length, n = mat[0].length;
     * 
     * if (m * n != r * c) return mat; // can't reshape
     * 
     * int[][] res = new int[r][c];
     * 
     * for (int i = 0; i < m * n; i++) {
     * // Calculate original row & col
     * int originalRow = i / n;
     * int originalCol = i % n;
     * 
     * // Calculate new row & col
     * int newRow = i / c;
     * int newCol = i % c;
     * 
     * res[newRow][newCol] = mat[originalRow][originalCol];
     * }
     * 
     * return res;
     * }
     */

    static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int arr[] = new int[digits.length + 1];
        arr[0] = 1;
        return arr;
    }

    static int removeDuplicates(int[] nums) {

        int index = 1;
        int prev = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (!(prev == nums[i])) {
                prev = nums[i];
                nums[index++] = prev;
            }
        }

        return index;
    }

    /*
     * int prev = nums[0];
     * int count = 1;
     * // 0, 0, 1, 1, 1, 2, 2, 3, 3, 4
     * for (int i = 0; i < nums.length; i++) {
     * if (nums[i] != prev) {
     * // System.out.println("prev: " + prev);
     * count++;
     * prev = nums[i];
     * }
     * }
     */

    static int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;

        for (int i : position) {
            if (i % 2 == 0)
                even++;
            else
                odd++;
        }
        return Math.min(even, odd);
    }
}
