import java.util.Scanner;

public class AlphabetCaseCheck {
    public static void main(String[] args) {
        

        Scanner in = new Scanner(System.in);

        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("it is a lower case");
        } else {
            System.out.println("not a lower case");
        }

        in.close();
    }
}
