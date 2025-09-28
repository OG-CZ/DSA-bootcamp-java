import java.util.Arrays;

public class Q02_SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println(Arrays.toString(search(arr, 6)));
    }

    // search in the row provided between the cols provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[] { row, mid };
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[] { -1, -1 };
    }

    static int[] search(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;

        if (r == 1) {
            return binarySearch(matrix, 0, 0, c - 1, target);
        }

        int rStart = 0;
        int rEnd = r - 1;
        int cMid = c / 2;
        // run the loop till 2 rows are remaining
        while (rStart < (rEnd - 1)) { // while this is true it will have more than 2 rows
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[] { mid, cMid };
            }

            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }

            // now we have 2 rows
            // check whether the target is in the col of 2 rows
            if (matrix[rStart][cMid] == target) {
                return new int[] { rStart, cMid };
            }
            if (matrix[rStart + 1][cMid] == target) {
                return new int[] { rStart + 1, cMid };
            }

            // search in 1st half
            if (target <= matrix[rStart][cMid - 1]) {
                return binarySearch(matrix, rStart, 0, cMid - 1, target);
            }
            // search in 2nd half
            if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][c - 1]) {
                return binarySearch(matrix, rStart, cMid + 1, c - 1, target);
            }
            // search in 3rd half
            if (target <= matrix[rStart + 1][cMid - 1]) {
                return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
            } else { // search in 4th half
                return binarySearch(matrix, rStart + 1, cMid - 1, c - 1, target);
            }
        }
        return new int[] { -1, -1 };
    }
}
