import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionEasyTwo {

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

        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < n; j++) {
                arr[indices[i][0]][j] += 1;
            }
            for (int j = 0; j < m; j++) {
                arr[j][indices[i][1]] += 1;
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
}