package lab02;

import java.util.Scanner;
// Viết chương trình tính số tiền điện
public class Bai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chương trình tính số tiền điện");
        int soDien;

        do{
            System.out.println("Nhập vào số điện: ");
            soDien = sc.nextInt();
            if (soDien > 0) {
                if(soDien <= 100) {
                    System.out.println("Số tiền phải trả là: " + (soDien*1000));
                }
                else {
                    System.out.println("Số tiền phải trả là: " + (100*1000) + (soDien - 100)*1500);
                }
            }
            else {
                System.out.println("Số điện phải là số nguyên dương");
            }
        } while(soDien < 0);
    }
}
