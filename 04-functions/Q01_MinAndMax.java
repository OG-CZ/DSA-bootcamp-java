public class Q01_MinAndMax {
    public static void main(String[] args) {
        System.out.println(minAndMax(25, 15, 55));
    }

    static String minAndMax(int... v) {
        int max = v[0];
        int min = v[0];
        for (int i : v) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        return "min: " + min + " max: " + max;
    }
}
