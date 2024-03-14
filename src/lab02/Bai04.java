package lab02;

import java.util.Scanner;

public class Bai04 {

    public static void PTB1() {
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
    }

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

    public static void PTB2() {
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

    public static void tinhTienDien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chương trình tính số tiền điện");
        int soDien;

        do{
            System.out.println("Nhập vào số điện: ");
            soDien = sc.nextInt();
            if (soDien > 0) {
                if(soDien <= 100) {
                    System.out.println("Số tiền phải trả là: " + (soDien*1000) + " VNĐ");
                }
                else {
                    int tienPhaiTra = (100*1000) + (soDien - 100)*1500;
                    System.out.println("Số tiền phải trả là: " + tienPhaiTra + " VNĐ");
                }
            }
            else {
                System.out.println("Số điện phải là số nguyên dương");
            }
        } while(soDien < 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
        System.out.println("++ ----------------------------------------- ++");
        System.out.println("| 1. Giải phương trình bậc nhất |");
        System.out.println("| 2. Giải phương trình bậc hai |");
        System.out.println("| 3. Tính số tiền điện |");
        System.out.println("| 4. Kết thúc |");
        System.out.println("++ ------------------ ++");
        System.out.println("Nhập vào tính năng bạn muốn chọn: ");
        int tinhNang = sc.nextInt();
        switch (tinhNang) {
            case 1:
                PTB1();
                break;
            case 2:
                PTB2();
                break;
            case 3:
                tinhTienDien();
                break;
            default:
                System.out.println("Kết thúc: ");
                System.exit(0);
        }
        sc.close();
    }
}
