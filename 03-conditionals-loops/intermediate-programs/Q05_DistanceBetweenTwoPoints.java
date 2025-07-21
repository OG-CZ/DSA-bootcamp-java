public class Q05_DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        int x1 = 0, y1 = 0, x2 = 6, y2 = 2;
        double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        System.out.println(distance);
    }
}
