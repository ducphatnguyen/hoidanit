package chapter9;

import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int x = sc.nextInt();
            System.out.println("Run try");
        }
        catch (Exception e) {
            System.out.println("Run catch");
        }
        finally {
            System.out.println("Run finally");
            sc.close();
        }
    }
}
