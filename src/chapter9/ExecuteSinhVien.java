package chapter9;

import java.util.Scanner;

public class ExecuteSinhVien {

    public static int nhapMasv() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sv: ");
        int result = 0;
        while (true) {
            try {
                result = scanner.nextInt();
                break;
            }
            catch (Exception e) {
                System.out.println("MSSV không hợp lệ, nhập vào số nguyên");
                scanner.next();
            }
        }
        scanner.close();
        return result;
    }


    public static void main(String[] args) {
        System.out.println("Run");

        int masv = nhapMasv();
        SinhVien sv1 = new SinhVien(masv, "Nguyễn Đức", 10, 23);
        System.out.println("Info: " + sv1);
    }
}
