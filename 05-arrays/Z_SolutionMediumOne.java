import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Z_SolutionMediumOne {
    public static void main(String[] args) {
        int ans1[][] = {
                { 0, 1, 2, 0 },
                { 3, 4, 5, 2 },
                { 1, 3, 1, 5 }
        };
        System.out.println(spiralOrder(ans1));

        for (int[] ans2 : generateMatrix(3)) {
            System.out.println(Arrays.toString(ans2));
        }

        int ans3[][] = {
                { 0, 1, 2, 0 },
                { 3, 4, 5, 2 },
                { 1, 3, 1, 5 }
        };
        setZeroes(ans3);
        for (int[] is : ans3) {
            System.out.println(Arrays.toString(is));
        }

        int ans4[] = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(productExceptSelf(ans4)));
    }

    static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int rows = matrix.length;
        int cols = matrix[0].length;

        int total = rows * cols;
        int count = 0;

        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;

        while (count < total) {
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
                count++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
                count++;
            }
            right--;

            for (int i = right; i >= left; i--) {
                result.add(matrix[bottom][i]);
                count++;

            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                result.add(matrix[i][left]);
                count++;
            }
            left++;
        }

        return result;
    }

    static int[][] generateMatrix(int n) {
        int val = 1;

        int[][] result = new int[n][n];
        int left = 0, top = 0, right = n - 1, bottom = n - 1;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                result[top][i] = val++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                result[i][right] = val++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                result[bottom][i] = val++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                result[i][left] = val++;
            }
            left++;
        }
        return result;
    }

    static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) { // ! comeback
        // Store all possible directions in an array.
        int[][] dir = new int[][] { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        int[][] traversed = new int[rows * cols][2];
        int index = 0;

        // Initial step size is 1, value of d represents the current direction.
        for (int step = 1, direction = 0; index < rows * cols;) {
            // direction = 0 -> East, direction = 1 -> South
            // direction = 2 -> West, direction = 3 -> North
            for (int i = 0; i < 2; ++i) {
                for (int j = 0; j < step; ++j) {
                    // Validate the current position
                    if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {
                        traversed[index][0] = rStart;
                        traversed[index][1] = cStart;
                        ++index;
                    }
                    // Make changes to the current position.
                    rStart += dir[direction][0];
                    cStart += dir[direction][1];
                }

                direction = (direction + 1) % 4;
            }
            ++step;
        }
        return traversed;
    }

    static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean firstRowHasZero = false;
        boolean firstColumnHasZero = false;

        // Check first row
        for (int i = 0; i < cols; i++) {
            if (matrix[0][i] == 0) {
                firstRowHasZero = true;
                break;
            }
        }

        // Check first column
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) {
                firstColumnHasZero = true;
                break;
            }
        }

        // Use first row/column as markers
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Zero rows based on markers
        for (int i = 1; i < rows; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < cols; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Zero columns based on markers
        for (int j = 1; j < cols; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 1; i < rows; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Zero first row if needed
        if (firstRowHasZero) {
            for (int j = 0; j < cols; j++) {
                matrix[0][j] = 0;
            }
        }

        // Zero first column if needed
        if (firstColumnHasZero) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        int productOne = 1;
        int productTwo = 1;
        int j = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            answer[i] = 1;
        }

        for (int i = 0; i < nums.length; i++) {
            answer[i] *= productOne;
            productOne *= nums[i];

            answer[j] *= productTwo;
            productTwo *= nums[j];
            j--;
        }
        return answer;
    }

}
