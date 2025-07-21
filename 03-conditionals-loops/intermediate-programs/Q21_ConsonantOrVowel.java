public class Q21_ConsonantOrVowel {
    public static void main(String[] args) {
        consonantOrVowel('f');
    }

    static void consonantOrVowel(char ch) {
        switch (Character.toUpperCase(ch)) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("a vowel");
                break;
            default:
                System.out.println("a consonant");
        }
    }
}
