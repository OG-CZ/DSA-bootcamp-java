public class RichestCustomerWealth {

    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][] {
                { 1, 2, 3 },
                { 3, 2, 1 }
        }));
    }

    static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }

            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }

        return maxWealth;
    }
}
