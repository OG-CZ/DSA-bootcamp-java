import java.util.Arrays;

public class Z_SolutionEasyThree {
    public static void main(String[] args) {
        
        int ans1mat[][] = {
            {0,1},
            {1,0},
        };

        int ans2target[][] = {
            {1,1},
            {0,1}
        };
        System.out.println(findRotation(ans1mat, ans2target));
    }

    static boolean findRotation(int[][] mat, int[][] target) {

        int n = mat.length;
        int first = 0, second = 0, third = 0,fourth = 0;
        System.out.println(mat.length);

        System.out.println(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[n - j - 1][i] == target[i][j]) {
                    first++;
                }

                if (mat[n - i - 1][n - j - 1] == target[i][j]){
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

        if (first == n*n || second == n*n || third == n*n || fourth == n*n) {
            return true;
        } 
        return false;
    }


}
