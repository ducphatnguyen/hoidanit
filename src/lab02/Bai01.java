package lab02;
import java.util.Scanner;
// Viết phương trình bậc nhất ax + b = 0
public class Bai01 {
    public static void main(String[] args) {
        System.out.println("Bài toán tính phương trình bậc nhất");
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào số nguyên a: ");
        int a = sc.nextInt();
        System.out.println("Nhập vào số nguyên b: ");
        int b = sc.nextInt();
        double x = ((double) -b /a);

        if(a == 0) {
            if(b == 0) {
                System.out.println("Phương trình có vô số nghiệm");
            }
            else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
        else {
            System.out.println("Phương trình có nghiệm là: " + x);
        }

        sc.close();
    }
}
