import java.util.Arrays;

public class MatrixDebug {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2},
            {3, 4}
        };

        int[][] rotated = new int[2][2];

        // TODO: Rotate 90 degrees clockwise
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                // Fill in the rotation logic
                rotated[j][rotated.length - i - 1] = mat[i][j];

            }
        }

        // Print rotated matrix
        for (int[] row : rotated) {
            System.out.println(Arrays.toString(row));
        }
    }
}
