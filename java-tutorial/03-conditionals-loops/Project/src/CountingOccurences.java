public class CountingOccurences {
    public static void main(String[] args) {

        // Q: Find how many times a given N = number is occuring
        
// my own version
        // String num = "1285028348";
        
        // char find = '8';
        // char ch[] = num.toCharArray();
        
        // int count = 0;

        // for (char c : ch) {
        //     if (c == find) {
        //         count++;
        //     }
        // }

// kunal version
        int n = 13839;
        int find = 3;

        int count = 0;
        while (n > 0) {
            int rem = n % 10; // gets last digit
            if (rem == find) count++; 
            n /= 10; // remove last digit
        }

        System.out.println("Ans: " + count);
    }
}
