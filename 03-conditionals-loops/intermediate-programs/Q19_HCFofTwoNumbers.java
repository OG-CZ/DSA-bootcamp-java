public class Q19_HCFofTwoNumbers {
    public static void main(String[] args) {
        int num1 = 4, num2 = 16;
        int hcf = 1;

        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) hcf = i;
        }

        System.out.println("hcf : " + hcf);
    }
}
