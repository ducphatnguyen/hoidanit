package lab05;
import java.util.ArrayList;
import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();

        while (true) {
            System.out.print("Nhập vào 1 số thực bất kỳ: ");
            Double x = sc.nextDouble();
            list.add(x);

            sc.nextLine();

            System.out.print("Nhập thêm: (Y/N) ??? ");
            String option = sc.nextLine();
            if(option.equals("N") || option.equals("n")) {
                break;
            }
        }

        System.out.println("Check list " + list);
        double sum = 0;
//      list.size();
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        System.out.println(" sum of list = " + sum);

    }
}
