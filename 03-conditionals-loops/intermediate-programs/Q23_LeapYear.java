public class Q23_LeapYear {
    public static void main(String[] args) {
        leapYear(2024);
    }

    static void leapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("a leap year");
                } else {
                    System.out.println("not a leap year");
                }
            } else {
                System.out.println("a leap year");
            }
        } else {
            System.out.println("not a leap year");
        }
    }
}
