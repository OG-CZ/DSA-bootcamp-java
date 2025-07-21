public class Q14_ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int original = num;
        int length = String.valueOf(num).length();
        int armstrong = 0;

        while (num != 0) {
            int mod = num % 10;
            num /= 10;
            armstrong += Math.pow(mod, length);
        }

        if (original == armstrong) System.out.println("it is a armstrong");
        else System.out.println("not a armstrong");
    }
}
