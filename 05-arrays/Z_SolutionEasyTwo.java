import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Z_SolutionEasyTwo {
    public static void main(String[] args) {

        String ans1pangram = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(ans1pangram));

        String ans2RuleKey = "Color";
        String ans2RuleValue = "Silver";
        System.out.println(countMatches(new ArrayList<>(Arrays.asList(
            new ArrayList<>(Arrays.asList("phone","blue","pixel")),
            new ArrayList<>(Arrays.asList("computer","silver","lenovo")),
            new ArrayList<>(Arrays.asList("phone","gold","iphone"))
        ))  , ans2RuleKey, ans2RuleValue));
        

        int ans3[] = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(ans3));


        int ans4[][] = {
            {1,1,0},
            {1,0,1},
            {0,0,0}
        };

        for (int[] i : flipAndInvertImage(ans4)) {
            System.out.println(Arrays.toString(i));
        }

        int ans5[][] = {{1,1}, {0,0}};
        System.out.println(oddCells(2, 2, ans5));

        int ans6[][] = {
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1}
        };
        System.out.println(diagonalSum(ans6));


        int ans7[] = {555,901,482,1771};
        System.out.println(findNumbers(ans7));

        int ans8[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        for (int[] is : transpose(ans8)) {
            System.out.println(Arrays.toString(is));
        }

        int ans9[] = {1,2,0,0};
        System.out.println(addToArrayForm(ans9, 34));

        int arr10[][] = {
            {1950, 1961},
            {1960, 1971},
            {1970, 1981}
        };
        System.out.println(maximumPopulation(arr10));

    }
    // ================================================================================

        static boolean checkIfPangram(String sentence) {

            sentence = sentence.toLowerCase();

            for (char ch = 'a'; ch <= 'z'; ch++) {
                
                if (sentence.indexOf(ch) == -1) {
                    return false;
                }
                /*
                *       if (!sentence.contains(String.valueOf(ch))) {
                    return false;
                }
                */
            }

            return true;
        }

        static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
            int index = 0;
            ruleValue = ruleValue.toLowerCase();

            if (ruleKey.equals("color")) {
                index = 1;
            } 
            if (ruleKey.equals("name")) {
                index = 2;
            }

            int count = 0;
            for (List<String> list : items) {
                if (list.get(index).equals(ruleValue)) {
                    count++;
                }
            }

        return count;
    }

    static int largestAltitude(int[] gain) {

        int arr[] = new int[gain.length + 1];
        
        arr[0] = 0;
        int count = 0;
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            arr[i] = arr[count] + gain[count]; 
            count++;
            
            if (max < arr[i]) {
                max = arr[i];
            }        
        }

     return max;   
    }

    static int[][] flipAndInvertImage(int[][] image) {
        
        int[][] arr = new int[image.length][image[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                arr[i][image[i].length - 1 - j] = image[i][j];

                if (arr[i][image[i].length - 1 - j] == 0) {
                    arr[i][image[i].length - 1 - j] = 1;
                } else arr[i][image[i].length - 1 - j] = 0;
            }    
        }
        

        return arr;
    }


    //    int ans5[][] = {{1,1}, {0,0}};
    static int oddCells(int m, int n, int[][] indices) {
        int arr[][] = new int[m][n];


        for (int i = 0; i < indices.length; i++) { // loop through each pair in indices
            for (int j = 0; j < n; j++) { // loop columns (j < n = 0 to n-1), update the whole row
                arr[indices[i][0]][j] += 1; 
                // indices[i][0] = get the row index from current pair
                // arr[indices[i][0]][j] → go to that row and increment all columns
            }

            for (int j = 0; j < m; j++) { // loop rows (j < m = 0 to m-1), update the whole column
                arr[j][indices[i][1]] += 1;
                // indices[i][1] = get the column index from current pair
                // arr[j][indices[i][1]] → go to that column and increment all rows
            }
        }

        int count = 0;
        for (int[] is : arr) {
            for (int is2 : is) {
                if (is2 % 2 != 0) {
                    count++;
                }
            }
        }

        
        return count; 
    }

    static int diagonalSum(int[][] mat) {
        int sum = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j) {
                    sum += mat[i][j];
                    if (i != mat.length - i - 1) {
                        sum += mat[mat[i].length - i - 1][j];
                    } 
                }

            }

        
        }

        return sum;
    }

    static int findNumbers(int[] nums) {
        int even = 0;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            while (nums[i] > 0) {
                nums[i] = nums[i] / 10;
                count++;
            }
            if (count % 2 == 0) {
                even++;
            }
        }

        return even;
    }

 // {1,2,3} {4,5,6} = 0 and 1
    static int[][] transpose(int[][] matrix) {
        int arr[][] = new int[matrix[0].length][matrix.length]; // number of columns and number of length
            
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = matrix[j][i];
                }
            }

        return arr;
    }

    /*
     * 
        | Step | `i` | `num[i]` | `k` before | `k += num[i]` | `k % 10` added | `k` after `/= 10` | `result`      |
        | ---- | --- | -------- | ---------- | ------------- | -------------- | ----------------- | ------------- |
        | 1    | 3   | 0        | 34         | 34            | 4              | 3                 | \[4]          |
        | 2    | 2   | 0        | 3          | 3             | 3              | 0                 | \[3, 4]       |
        | 3    | 1   | 2        | 0          | 2             | 2              | 0                 | \[2, 3, 4]    |
        | 4    | 0   | 1        | 0          | 1             | 1              | 0                 | \[1, 2, 3, 4] |
        | 5    | -1  | —        | 0          | loop ends     | —              | —                 | —             |
     *
     */

     /*
        Iteration 1:
        i = 1, num[i] = 1
        k = 142
        k += num[i] → 142 + 1 = 143
        addFirst(143 % 10) → 3
        k = 143 / 10 = 14
        i-- = 0

        Iteration 2:
        i = 0, num[i] = 0
        k += 0 → 14 + 0 = 14
        addFirst(14 % 10) = 4
        k = 14 / 10 = 1
        i-- = -1

        Iteration 3:
        i = -1, so skip num[i]
        k = 1
        addFirst(1 % 10) = 1
        k = 1 / 10 = 0 
    
      */
    static List<Integer> addToArrayForm(int[] num, int k) { 
        LinkedList<Integer> list = new LinkedList<>(); // To store the result digits in order

        int i = num.length - 1; // Start from the last index (rightmost digit)

        // Keep looping while there are digits in num[] OR digits in k
        while (i >= 0 || k > 0) {
            if (i >= 0) {     // this disables reading negative numbers or below numbers for num[] cuase it will error if it has num[-1]
                k += num[i];  // Add num[i] to k to simulate digit-by-digit addition
                i--;          // Move to the next digit (leftward)
            }

            // Get the current digit (rightmost) and add it to the front of the list
            list.addFirst(k % 10);

            // Remove the last digit from k (carry forward to the next iteration)
            k /= 10;
        }

        return list; // Return the final result
    }

    static int maximumPopulation(int[][] logs) { // ! comeback

        int years[] = new int[101];

        for (int[] is : logs) {
            int birth = is[0];
            int death = is[1];

            years[birth - 1950] += 1;
            years[death - 1950] -= 1;
        }

        int maxPop = 0;
        int currentPop = 0;
        int maxYear = 0;

        for (int i = 0; i < years.length; i++) {
            currentPop += years[i];
           if (currentPop > maxPop) {
                maxPop = currentPop;
                maxYear = 1950 + i;
           }
        }

        return maxYear;
    }
    
}