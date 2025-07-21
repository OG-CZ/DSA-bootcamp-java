public class Q01_Factorial {
    public static void main(String[] args) {
        int num = 10;
        int result = 1;
        while (num > 0) {
            result *= num;
            num--;
        }
        System.out.println(result);
    }
}
