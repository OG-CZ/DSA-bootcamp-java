package FirstProject.src.com.ogcreate;


public class TypePromotion {

    public static void main(String[] args) {

        int a = 257;
        byte b = (byte) a;
        System.out.println(b);


        byte x = 50;
        byte j = 50;
        byte k = 40;

        int equals = x * j / k;
        System.out.println(equals);

        byte cc = 50;
       // byte dd = cc * 55; Type mismatch: cannot convert from int to byte

       int number = 'C'; 
       System.out.println(number); // 67 = ASCCI VALUE OF THIS
 
    }

}
