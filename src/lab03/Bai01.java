package lab03;
import java.util.Scanner;
// Bài 1: Viết chương trình nhập vào 1 số nguyên từ bàn phím. Hiển thị kết quả số đấy là số nguyên tố hay không ?
public class Bai01 {
    public static boolean isPrime(int n) {
        if(n < 2) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chương trình kiểm tra số nguyên tố: ");
        System.out.println("Nhập vào n: ");
        int n = sc.nextInt();
        if(isPrime(n)) {
            System.out.println(n + " là số nguyên tố");
        }
        else {
            System.out.println(n + " không phải là số nguyên tố");
        }
    }
}
