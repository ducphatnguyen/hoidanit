package lab01;

import java.util.Scanner;

// Nhập vào 1 cạnh của 1 khối lập phương và tính toán thể tích của nó
public class Bai03 {
    public static void main(String[] args) {
        System.out.println("Bài 03 run");

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một cạnh của một khối lập phương: ");
        double side = sc.nextDouble();
        double volume = Math.pow(side,3);
        System.out.println("Thể tích của khối lập phương là: " + volume);
        sc.close();
    }
}
