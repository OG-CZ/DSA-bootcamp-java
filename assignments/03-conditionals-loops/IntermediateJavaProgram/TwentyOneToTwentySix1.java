
import java.util.Arrays;



public class TwentyOneToTwentySix1 {
    public static void main(String[] args) {
        consonantOrVowel('f');
        perfectNumber(6);
        leapYear(2024);
        sumOfDigits(123);
        sadKunal();

        sumItAll(new int[] {3, 4, 5, 9, 11, 14, 19, -3, -6, 89, -200, 23, -5});
    }

    static void consonantOrVowel(char ch) {
        switch (Character.toUpperCase(ch)) {
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
                System.out.println("a vowel");
                break;
            default:
            System.out.println("a consonant");
                break;
        }
    }
    static void perfectNumber(int num) {
        
        int count = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        int arr[] = new int[count];
        int perfectNumber = 0;
        int index = 0;

        for (int j = 1; j < num; j++) {
              if (num % j == 0) {
                arr[index] = j;
                perfectNumber += j;
                index++;
            }
        }

        if (perfectNumber == num) {
            System.out.println(Arrays.toString(arr) + " = " + perfectNumber + " is a perfect number");
        }
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

    static void sumOfDigits(int num) {
        int sum = 0;
        int mod = 0;
        while (num > 0) {
            mod = num % 10;
            sum += mod;
            num /= 10;
        }
        System.out.println(sum);
    }

    static void sadKunal() {
        int daysInAugust = 31;
        int count = 0;
        for (int i = 1; i <= daysInAugust; i++) {
            if (i % 2 == 0) {
                count++;
            }    
        }
        System.out.println(count);
    }

    static void sumItAll(int num[]) {

        int pos = 0;
        int neg = 0;
        int even = 0;
        int odd = 0;
        for (int i = 0; i < num.length; i++) {

            if (num[i] < 0) {
                neg += num[i];
            }

            if (num[i] % 2 == 0 && num[i] > 0) {
                pos += num[i];
                even += num[i];                
            }

            if (num[i] % 2 != 0 && num[i] > 0) {
                pos += num[i];
                odd += num[i];
            }

        }

        System.out.println("Sum => positive:" + pos + " => negative:" + neg + " => even:" + even + " => odd:" + odd);
    }
}
