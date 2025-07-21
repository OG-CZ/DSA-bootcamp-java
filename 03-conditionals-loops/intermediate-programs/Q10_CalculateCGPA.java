public class Q10_CalculateCGPA {
    public static void main(String[] args) {
        int[] marks = {90, 80, 70, 80, 90};
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        double cgpa = ((double) sum / marks.length) / 10.0;
        double percentage = cgpa * 9.5;

        System.out.println("CGPA = " + cgpa + " Percentage = " + percentage);
    }
}
