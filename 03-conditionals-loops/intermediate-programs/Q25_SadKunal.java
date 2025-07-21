public class Q25_SadKunal {
    public static void main(String[] args) {
        sadKunal();
    }

    static void sadKunal() {
        int count = 0;
        for (int i = 1; i <= 31; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
