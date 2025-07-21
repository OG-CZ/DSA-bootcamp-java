public class Q06_CircleCalcutator {
    public static void main(String[] args) {
        System.out.println(areaAndPerimeterOfCircle(3));
    }

    static String areaAndPerimeterOfCircle(int radius) {
        return "Circumference: " + 2 * Math.PI * radius + "  Area: " + Math.PI * Math.pow(radius, 2);
    }
}
