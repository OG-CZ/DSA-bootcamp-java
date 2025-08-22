import java.util.Arrays;

public class Search2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 23, 4, 1 },
                { 18, 12, 3, 9 },
                { 78, 99, 34, 56 },
                { 18, 12 }
        };
        System.out.println(search2Dint(arr, 34));
        System.out.println(search2Dint(arr, 1000));

        System.out.println(Arrays.toString(search2Darr(arr, 12)));

        System.out.println(max(arr));
    }

    static int search2Dint(int[][] arr, int target) {
        if (arr.length == 0)
            return -1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j])
                    return i;
            }
        }
        return -1;
    }

    static int[] search2Darr(int[][] arr, int target) {
        if (arr.length == 0)
            return new int[] { -1 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j])
                    return new int[] { i, j };
            }
        }
        return new int[] { -1 };
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;

        for (int[] is : arr) {
            for (int i = 0; i < is.length; i++) {
                if (is[i] > max) {
                    max = is[i];
                }
            }
        }
        return max;
    }
}
