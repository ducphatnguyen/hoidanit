package lab03;
// Bài 3: Viết chương trình nhập vào 1 mảng số nguyên bất kỳ:
//- Sắp xếp và xuất mảng vừa nhập ra màn hình
//- Xuất phần tử có giá trị nhỏ nhất
//- Xuất phần tử có giá trị lớn nhất
//Gợi ý:

import java.util.Arrays;
import java.util.Scanner;

public class Bai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong mảng: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phần tử thứ: " + (i+1));
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);
        System.out.println("Mảng sau khi sắp xếp là: ");
        System.out.println(Arrays.toString(array));

        System.out.println("Phần tử lớn nhất là: " +array[array.length-1]);
        System.out.println("Phần tử lớn nhất là: " +array[0]);
    }
}
