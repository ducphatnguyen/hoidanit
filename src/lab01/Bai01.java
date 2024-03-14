package lab01;
import java.util.Scanner;

// Nhập tên sinh viên và điểm trung bình sau đó in ra
public class Bai01 {
    public static void main(String[] args) {
        System.out.println("Bài 01 run");

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên: ");
        String tenSinhVien = sc.nextLine();
        System.out.println("Nhập điểm trung bình: ");
        double diemTrungBinh = sc.nextDouble();
        System.out.println(tenSinhVien + " có điểm = " + diemTrungBinh );
        sc.close();
    }
}
