public class Q07_GradeCalculator {
    public static void main(String[] args) {
        System.out.println(gradeCalculator(41));
    }

    static String gradeCalculator(int grade) {
        if (grade >= 91) return "AA";
        else if (grade >= 81) return "AB";
        else if (grade >= 71) return "BB";
        else if (grade >= 61) return "BC";
        else if (grade >= 51) return "CD";
        else if (grade >= 41) return "DD";
        return "fail";
    }
}
