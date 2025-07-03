public class TenToTwenty {

    public static void main(String[] args) {

        perimeterOfSquare(5);
        perimterOfRhombus(5);
        volumeOfCone(3, 5);
        volumeOfPrism(5, 15);
        volumeOfCylinder(3, 5);
        volumeOfSphere(5);
        volumeOfPyramid(5, 5, 5);
        curvedSurfaceAreaOfACylinder(5, 15);
        totalSurfaceAreaOfACube(24);
        
    }

    static void perimeterOfSquare(int side) {
        int p = side * 4;
        System.out.println(p);
    }

    static void perimterOfRhombus(int side) {
        int p = side + side + side + side;
        System.out.println(p);
    }

    static void volumeOfCone(int r, int h) {
        double v = (1.0 /3.0) * Math.PI * Math.pow(r, 2) * h;
        System.out.println(v);
    }

    static void volumeOfPrism(int base, int height) {
        int v = base * height;
        System.out.println(v);
    }

    static void volumeOfCylinder(int r, int h) {
        double v = Math.PI * Math.pow(r, 2) * h;
        System.out.println(v);
    }

    static void volumeOfSphere(double  r) {
        double v = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        System.out.println(v);
    }

    static void volumeOfPyramid(int length, int width, int height) {
        double v = (length * width * height) / 3.0;
        System.out.println(v);
    }

    static void curvedSurfaceAreaOfACylinder(int radius, int height) {
        double a = 2 * Math.PI * radius * height;
        System.out.println(a);
    }

    static void totalSurfaceAreaOfACube(int sideLength) {
        double a = 6 * Math.pow(sideLength, 2);
        System.out.println(a);
    }
  
}