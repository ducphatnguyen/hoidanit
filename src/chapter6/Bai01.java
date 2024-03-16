package chapter6;

import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào username: ");
        String username = sc.nextLine();
        System.out.print("Nhập vào password: ");
        String password = sc.nextLine();

        if(username.equals("hoidanit") && password.length() > 6) {
            System.out.println("Valid input");
        }

        sc.close();

    }
}
