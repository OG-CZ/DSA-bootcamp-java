public class Q17_PalindromeChecker {
    public static void main(String[] args) {
        int num = 1221;
        String original = String.valueOf(num);
        String reversed = "";

        while (num != 0) {
            reversed += num % 10;
            num /= 10;
        }

        if (original.equals(reversed)) System.out.println("a palindrome");
        else System.out.println("not a palindrome");
    }
}
