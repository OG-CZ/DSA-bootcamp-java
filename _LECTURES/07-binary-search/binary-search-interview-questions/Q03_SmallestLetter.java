public class Q03_SmallestLetter {
    public static void main(String[] args) {

        char letters[] = { 'c', 'f', 'j' };

        System.out.println(nextGreatestLetter(letters, 'a'));
    }

    static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (target < letters[middle])
                end = middle - 1;
            else {
                start = middle + 1;
            }
        }
        return letters[start % letters.length];

    }
}
