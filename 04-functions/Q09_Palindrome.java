public class Q09_Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(12221));
    }

    static String palindrome(int num) {
        String str = String.valueOf(num);
        int length = str.length() - 1;

        for (int i = 0; i <= length / 2; i++) {
            char left = str.charAt(i);
            char right = str.charAt(length - i);
            if (left != right) return "not a palindrome";
        }
        return "palindrome";
    }
}
