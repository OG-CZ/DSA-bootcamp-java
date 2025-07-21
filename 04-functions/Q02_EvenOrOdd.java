public class Q02_EvenOrOdd {
    public static void main(String[] args) {
        System.out.println(evenOrOdd(5));
    }

    static String evenOrOdd(int num) {
        if (num < 1) return "Invalid";
        return (num % 2 == 0) ? "Even" : "Odd";
    }
}
