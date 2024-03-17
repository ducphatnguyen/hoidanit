package chapter9;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Nhập x: ");
                int x = sc.nextInt();
                try {
                    System.out.println("Kết quả: 10/x = " + (10/x));
                    break;
                }
                catch (Exception e) {
                    System.out.println("run x = " + x);
                }
            }
            catch (Exception e) {
                System.out.println("run error");
            }
        }

    }
}
