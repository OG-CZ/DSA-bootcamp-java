public class LargestNumber {

    public static void main(String[] args) {
        

        int a = 10;
        int b = 20;
        int c = 30;
// first example
        // int max = a;
        // if (b > max) {
        //     max = b;
        // }

        // if (c > max) {
        //     max = c;
        // }

// second example
        // int max = 0;

        // if (a > b) {
        //     max = a;
        // }

        // if (c > max) {
        //     max = c;
        // }

// 3rd example
        int max = Math.max(c, Math.max(a, b));

        System.out.println(max);
    }
    
}
