
public class OneToTen {

    public static void main(String[] args) {

        areaOfCircle(7);
        areaOfTri(4, 3);
        areaOfRectangle(4, 3);
        areaOfisocelesTri(3, 5);
        areaOfParallelogram(5, 3);
        areaOfRhombus(12, 14);
        areaOfEquilateralTri(3);
        perimiterOfTri(10);
        perimeterOfParallelogram(6, 4);
        perimeterOfRectangle(5.5, 10.5);

    }

    static void areaOfCircle(double a) {
        a = Math.PI * (a * a);
        System.out.println(a);
    }

    static void areaOfTri(double b, double h) {
        double a = .5 * (b * h);
        int x = (int) a;
        System.out.println(x);
    }

    static void areaOfRectangle(int l, int w) {
        int a = l * w;
        System.out.println(a);
    }

    static void areaOfisocelesTri(double b, double h) {
        double a = .5 * (b * h);
        int x = (int) a;
        System.out.println(x);
    }

    static void areaOfParallelogram(int b, int h) {
        System.out.println(b * h);
    }

    static void areaOfRhombus(int d1, int d2) {
        System.err.println(.5 * (d1 * d2));
    }

    static void areaOfEquilateralTri(int a) {
        double x = (Math.sqrt(3) / 4) * Math.pow(a, 2);
        System.out.println(x);
    }

    static void perimiterOfTri(int diameter) {
        double circumference = Math.PI * diameter;
        System.out.println(circumference);
    }

    static void perimeterOfParallelogram(int length, int width) {
        int p = 2 * length + 2 * width;
        System.out.println(p);
    }

    static void perimeterOfRectangle(double length, double width) {
        double p = (length + width) * 2;

        System.out.println(p);
    }

}
