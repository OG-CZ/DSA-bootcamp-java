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

    }

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
}