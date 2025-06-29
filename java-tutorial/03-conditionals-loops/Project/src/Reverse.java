public class Reverse {
    public static void main(String[] args) {
        
        int num = 23579;
        int rev = 0;

        while (num > 0) {   
            int rem = num % 10; // get last digit 
            num = num / 10; // remove last digit
            rev = rev * 10 + rem;
        }
        System.out.println(rev);

    }
}
