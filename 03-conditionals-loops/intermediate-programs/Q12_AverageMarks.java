import java.util.Arrays;

public class Q12_AverageMarks {
    public static void main(String[] args) {
        int[] marks = {80, 85, 90, 100, 95};
        int sum = 0;
        int[] reversed = new int[marks.length];
        int idx = marks.length - 1;

        for (int mark : marks) {
            sum += mark;
            reversed[idx--] = mark;
        }

        System.out.println("Average of " + Arrays.toString(reversed) + " is " + (sum / marks.length));
    }
}
