import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {

        System.out.println(searchString1("null", 'l'));
        System.out.println(searchString1("myway", 'x'));

        System.out.println(searchString2("null", 'u'));
        System.out.println(searchString2("myway", 'x'));

        String str = "what";
        System.out.println(Arrays.toString(str.toCharArray()));
    }

    static boolean searchString1(String str, char target) {

        if (str.length() == 0)
            return false;

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i))
                return true;
        }

        return false;
    }

    static boolean searchString2(String str, char target) {

        if (str.length() == 0)
            return false;

        for (char ch : str.toCharArray()) {
            if (ch == target)
                return true;
        }
        return false;
    }
}
