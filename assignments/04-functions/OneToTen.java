
public class OneToTen {

    public static void main(String[] args) {
        
        System.out.println(minAndMax(25, 15, 55));
        System.out.println(evenOrOdd(-1));
    }

    static String minAndMax(int ...v) {
        int max = v[0];
        int min = v[0];
        for (int i : v) {
            if (i < max) min = i;
            if (i > max) max = i; 
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
    
}
