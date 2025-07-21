
import java.util.Arrays;

public class ElevenToTwenty {
    public static void main(String[] args) {
        
        compoundInterest(12_000, 0.03, 365, 10);
        averageMarks(new int[] {80, 85, 90, 100, 95});
        sumOfNumbers(new int[] {5, 5, 5, 5, 5});
        armstrongNumber(153);
        findNcrNpr(2, 5);

        reverseString("carl");
        palindromeChecker(1221);
        futureInvestmentValue(1000, 0.10, 5);
        HCFofTwoNumbers(4, 16);
        LCMofTwoNumbers(5, 77);
    }

    static void compoundInterest(int p, double  r, int n, int t) {
        double a = (double) p * (Math.pow((1.0 + ((double) r / n)), (n * t)));
        System.out.println(a);
    }

    static void averageMarks(int mark[]) {
        int arr[] = new int[mark.length];
        int sum = 0;
        int length = mark.length - 1;
        for (int i : mark) {
            sum += i;
            arr[length] = i;
            length--;
        }
        System.out.println("Average of " + Arrays.toString(arr) + " is " + sum / mark.length);
    }

    static void sumOfNumbers(int num[]) {
        int sum = 0;
        for (int i : num) {
            sum += i;
        }
        System.out.println(sum);
    }

    static void armstrongNumber(int num) {
        int length = Integer.toString(num).length();
        
        int check = num;
        int mod = 1;
        double result = 1;
        int armstrongNumber = 0;
        while (num != 0) {
            mod = num % 10; // get current number's last digit
            num /= 10; // remove last digit
            result = (int) Math.pow(mod, length);
            armstrongNumber += result;
        }
        if (check == armstrongNumber) System.out.println("it is a armstrong");
        else System.out.println("not a armstrong");
    }

    static void findNcrNpr(int r, int n) {
        int nPr = factorial(n) / factorial(n - r);
        int nCr = factorial(n) /  factorial(r) * factorial(n - r);
    
        System.out.println("nPr = " + nPr);
        System.out.println("nCr = " + nCr);
    }

    static int factorial(int num) {
        int result = 1;
        while (num > 0) {
            result *= num;
            num--;
        }
        return result;
    }

    static void reverseString(String str) {
        String reverse = "";
        int count = str.length() - 1;
        while (count >= 0) {
            reverse += String.valueOf(str.charAt(count));
            count--;
        }
        System.out.println(reverse + " " + str);
    }

    static void palindromeChecker(int num) {

        int length = Integer.toString(num).length();
        String number = "";
        String reverse = "";

        for (int i = 0; i < length / 2; i++) {
                number += String.valueOf(num).charAt(i);
                reverse += String.valueOf(num % 10);
                num /= 10;
        }  

        if (number.equals(reverse)) {
            System.out.println("a palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }

    static void futureInvestmentValue(int pv, double r, int n) {
        double fv = pv * Math.pow((1.0 + r), n);
        System.out.println(fv);
    }

    static void HCFofTwoNumbers(int num1, int num2) {
        
        int hcf = 0;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }
        System.out.println("hcf : " + hcf);
    }
    

    static void LCMofTwoNumbers(int num1, int num2) { 
        int max = Math.max(num2, num1);
        int lcm = max;

        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0 ) {
                System.out.println("lcm : " + lcm);
                return;
            }
            lcm++;
        }
    }


}

/*        if (product == num1) {
            System.out.println(product);
            return;
        } 

        if (product == num2) {
            System.out.println(product);
            return;
        }


        if (num1 < num2) {
            product = num1 * i;
        } else product = num2 * i; */