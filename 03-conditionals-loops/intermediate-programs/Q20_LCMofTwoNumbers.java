public class Q20_LCMofTwoNumbers {
    public static void main(String[] args) {
        int num1 = 5, num2 = 77;
        int max = Math.max(num1, num2);
        int lcm = max;

        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                System.out.println("lcm : " + lcm);
                break;
            }
            lcm++;
        }
    }
}
