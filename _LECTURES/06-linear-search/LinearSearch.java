public class LinearSearch {

    public static void main(String[] args) {

        System.out.println(linearSearch(new int[] { 1, 2, 3, 4, 5, 6 }, 5));
        System.out.println(linearSearch(new int[] { 412, 516, 73, 8 }, 0));
    }

    // search in the array: return the index if item is found
    // otherwise if not found: return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0)
            return -1;

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }
}