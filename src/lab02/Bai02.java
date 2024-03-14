package lab02;
import java.util.Scanner;
// Viết phương trình tính phương trình bậc 2
public class Bai02 {

    public static void PTB1(int a, int b) {
        if(a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm");
            }
            else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
        else {
            double x = (double) -b/a;
            System.out.println("Phương trình có nghiệm là: " + x);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bái toán phương trình bậc 2: ");

        System.out.println("Nhập vào số nguyên a: ");
        int a = sc.nextInt();
        System.out.println("Nhập vào số nguyên b: ");
        int b = sc.nextInt();
        System.out.println("Nhập vào số nguyên c: ");
        int c = sc.nextInt();

        if(a == 0) {
            System.out.println("Phương trình chuyển về dạng bậc nhất");
            PTB1(b,c);
        }
        else {
            double delta = b*b - 4*a*c;
            if(delta > 0) {
                double x1 = ( -b + Math.sqrt(delta) ) / 2*a;
                double x2 = ( -b - Math.sqrt(delta) ) / 2*a;
                System.out.println("Phương trình bậc 2 có 2 nghiệm phân biệt là: ");
                System.out.printf("x1: %.2f\n",x1);
                System.out.printf("x2: %.2f\n",x2);
            }
            else if(delta == 0) {
                double x = (double) -b / 2*a;
                System.out.println("Phương trình bậc 2 có nghiệm kép là: ");
                System.out.printf("x: %.2f\n" ,x);
            }
            else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
