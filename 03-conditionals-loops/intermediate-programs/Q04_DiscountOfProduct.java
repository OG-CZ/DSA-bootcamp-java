public class Q04_DiscountOfProduct {
    public static void main(String[] args) {
        double productPrice = 100;
        double discount = 25;
        discount /= 100.0;
        productPrice /= 100.0;
        double finalPrice = (productPrice - discount) * 100;
        System.out.println(finalPrice);
    }
}
