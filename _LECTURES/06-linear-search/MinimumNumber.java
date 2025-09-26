public class MinimumNumber {
    public static void main(String[] args) {

        System.out.println(minimumNumber(new int[] { 18, 12, -19, 3, 44, 20 }));
    }

    static int minimumNumber(int[] arr) {
        int min = arr[0];

        for (int i : arr) {
            if (i < min)
                min = i;
        }
        return min;
    }
}
