public class Q03_Vote {
    public static void main(String[] args) {
        vote(19);
    }

    static void vote(int age) {
        if (age <= 18) {
            System.out.println("you are not allowed to vote");
        } else {
            System.out.println("you are allowed to vote");
        }
    }
}
