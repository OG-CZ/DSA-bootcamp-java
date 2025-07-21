import java.util.Scanner;

public class Q02_Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("2. Enter your name: ");
        String name = in.nextLine();

        System.out.println(name + ", Welcome Back!");
    }
}
