package hoidanit;

import java.util.Scanner;
// Chương trình tính thuế theo điều kiện
public class TinhThue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tax: ");
        int tax = sc.nextInt();

        if(tax < 10) {
            System.out.println("Không đóng thuế");
        } else if (10 <= tax && tax <= 15) {
            System.out.println("Thuế 10%");
        } else if (15 < tax && tax <= 30) {
            System.out.println("Thuế 30%");
        } else {
            System.out.println("Thuế 50%");
        }
        sc.close();

    }
}
