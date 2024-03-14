package lab01;
import java.util.Scanner;
// Nhập vào 2 cạnh hình chữ nhật sau đó tính chu vi, diện tích và cạnh nhỏ nhất
public class Bai02 {
    public static void main(String[] args) {
        System.out.println("Bài 02 run");

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài hình chữ nhật: ");
        double a = sc.nextDouble();
        System.out.println("Nhập chiều rộng hình chữ nhật: ");
        double b = sc.nextDouble();

        double chuVi = (a+b)*2;
        double dienTich = a*b;
        double canhNhoNhat = Math.min(a,b);

        System.out.println("Chu vi hình chữ nhật là: " + chuVi);
        System.out.println("Diện tích hình chữ nhật là: " + dienTich);
        System.out.println("Cạnh nhỏ nhất là: " + canhNhoNhat);

        sc.close();
    }
}
