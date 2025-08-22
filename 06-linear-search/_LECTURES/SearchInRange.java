public class SearchInRange {
    public static void main(String[] args) {

        System.out.println(searchInRange(new int[] { 6, 3, 9, 1, 0 }, 9, 1, 3));
        System.out.println(searchInRange(new int[] { 6, 3, 9, 1, 0 }, 6, 1, 2));

    }

    static int searchInRange(int[] arr, int target, int start, int end) {

        if (arr.length == 0)
            return -1;

        for (int i = start; i < end; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }
}
