package hoidanit;
import java.util.Scanner;
public class NhapDuLieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("My name is: ");
        String name = sc.nextLine();
        System.out.println("My age is: ");
        int age = sc.nextInt();
        System.out.println("So, my name is: " + name + ", my age is: " + age);

        sc.close();
    }
}
