package lab03;

// Tính toán bảng cửu chương từ 1 đến 10
public class Bai02 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Bảng cửu chương " + i);
            for (int j = 1; j <= 10 ; j++) {
                System.out.println(i + " * " +  j + " = " + (i*j));
            }
        }
    }
}
