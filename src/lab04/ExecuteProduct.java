package lab04;

public class ExecuteProduct {
    public static void main(String[] args) {
        System.out.println("Run Product");

        Product test = new Product();
        Product product1 = test.nhapThongTin("computer", 200, 0.1);
        test.xuatThongTin(product1);
        System.out.println("Tax: " + test.getTaxPrice(product1.getPrice(),product1.getTax()));
    }
}
