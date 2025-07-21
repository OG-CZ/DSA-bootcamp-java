
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class OneToTen {

    public static void main(String[] args) {

        System.out.println(minAndMax(25, 15, 55));
        System.out.println(evenOrOdd(-1));
        vote(19);
        System.out.println(sum(1, 1));
        System.out.println(product(1, 5));
        System.out.println(areaAndPerimeteOfACircle(3));
        System.out.println(gradeCalculator(41));
        System.out.println(factorial(4));
        System.out.println(palindrome(12221));
        System.out.println(pythagoreanTriplet(5, 3, 4));
        System.out.println(primeNumbers(10, 50));
        System.out.println(sumOfNaturalNumbers(5));
    }

    static String minAndMax(int... v) {
        int max = v[0];
        int min = v[0];
        for (int i : v) {
            if (i < max) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        return "min:" + min + " max:" + max;
    }

    static String evenOrOdd(int num) {

        if (num < 1) {
            return "Invalid";
        }

        if (num % 2 == 0) {
            return "Even";
        }

        return "Odd";
    }

    static void vote(int age) {
        if (age <= 18) {
            System.out.println("you are not allowed to vote");
            return;
        }
        System.out.println("you are allowed to vote");
    }

    static int sum(int num1, int num2) {
        return num1 + num2;
    }

    static int product(int num1, int num2) {
        return num1 * num2;
    }

    static String areaAndPerimeteOfACircle(int radius) {
        return "Circumference:" + 2 * Math.PI * radius + "  Area:" + (double) 2 * Math.PI * Math.pow(radius, 2);
    }

    static String gradeCalculator(int grade) {
        
        if (grade >= 91) {
            return "AA";
        } else if (grade >= 81) {
            return "AB";
        } else if (grade >= 71) {
            return "BB";
        } else if (grade >= 61) {
            return "BC";
        } else if (grade >= 51) {
            return "CD";
        } else if (grade >= 41) {
            return "DD";
        }

        return "fail";
    }
    
    static String factorial(int num) {
        int product = 1;
        int[] factorial = new int[num];
        int count = 0;
        int original = num;

        while (num > 0) {
        factorial[count] = num;
        product *= num;
        num--;
        count++;
        }

        return original +"! = " + Arrays.toString(factorial) + " = " + product;
    }

    static String palindrome(int num) {
    String str = String.valueOf(num);
    int length = str.length() - 1;

    for (int i = 0; i < length / 2; i++) {
        char left = str.charAt(i);
        char right = str.charAt(length - i);
        if (left != right) {
            return "not a palindrome";
        }
    }
        return "palindrome";
    }

    static String pythagoreanTriplet(int num1, int num2, int num3) {
        int[] arr = {num1, num2, num3};
        Arrays.sort(arr);

        double pythagoreanTriplet = (double) Math.pow(arr[0], 2) + Math.pow(arr[1], 2);
        return (pythagoreanTriplet == Math.pow(arr[2], 2)) ? "Pythagorean" : "Not Pythagorean";
    }

    static String primeNumbers(int num1, int num2) {
        List<Integer> prime = new ArrayList<>();

        for (int i = num1; i <= num2; i++) {
            if (i < 2) continue; 

            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) { 
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) prime.add(i); 
        }

        return  "Prime numbers: " + String.valueOf(prime);
    }

    
    static int sumOfNaturalNumbers(int num) {
        int sum = 0;
        for (int i = 0; num != 0; i++) {
            sum += num;
            num--;
        }
        return sum;
    }

}
