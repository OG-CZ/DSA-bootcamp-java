import java.util.Scanner;

public class TwentyOneToTwentySix {
    public static void main(String[] args) {
        
        fibonacciSeries();
        subtractProductAndSum(234);
        factor(24);
        factor2(24);
        loopOfSum();
        loopOfLargestNum();
        additionOfTwoNum(2, 2);
        

    }

        static void fibonacciSeries() {

            int a = 0;
            int b = 1;

            for (int i = 0; i < 10; i++) {
                int c = a + b;
                a = b;
                b = c;

                System.out.print(c + " ");
            }
            System.out.println();
        }

        static void subtractProductAndSum(int n) {
            int product = 1;
            int sum = 0;

            while (n > 0) {
                int modulo = n % 10;
                sum += modulo;
                product *= modulo;
                n /= 10;
            }
            System.out.print(product - sum);
            System.out.println();

        }

        static void factor(int num) {
            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= num; j++) {
                    if ((i * j) == num) {
                        System.out.print(i + " ");
                    }
                }   
            }
            System.out.println();
        }

        static void factor2(int num) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.print(i + " ");
                }
            }

            System.out.println();
        }

    @SuppressWarnings("ConvertToTryWithResources")
        static void loopOfSum() {{

            Scanner in = new Scanner(System.in);
            int add = 0;
            boolean flag = true;

            while (flag) {
                System.out.print("Enter number to sum (Press 0 for Exit): ");
                int num = in.nextInt();
                if (num == 0) flag = false;

                add =+ num;
            }

            System.out.println(add);
            in.close();
        }
    }

    @SuppressWarnings("ConvertToTryWithResources")
        static void loopOfLargestNum() {

            Scanner in = new Scanner(System.in);
            int input;
            int temp = 550;

            do { 
                System.out.print("Enter number to sum (Press 0 for Exit): ");
                input = in.nextInt();

                if (temp < input) {
                    temp = input;
                }

            } while (input != 0);

            System.out.println(temp);
            in.close();

        }

        static void additionOfTwoNum(int num1, int num2) {
            System.out.println(num1 + num2);
        }
}
