package hoidanit;
import java.util.Scanner;
// Math (sqrt, max, min, pow)
public class HamToanHoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First number is: ");
        int a = sc.nextInt();
        System.out.println("Second number is: ");
        int b = sc.nextInt();
        System.out.println("Min: " + Math.min(a,b) + ", Max: " + Math.max(a,b));
        sc.close();
    }
}
