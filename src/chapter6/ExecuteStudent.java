package chapter6;

// Ví dụ 2: Ứng dụng quản lý sinh viên
//- Tạo class Student với thuộc tính name, id
//- Tại hàm main, tạo 5 students với tên khác nhau (sử dụng constructor)
//eg: new Student("Nam", 1); new Student("Eric", 2);
//Yêu cầu: tìm và xuất ra:
//- các student có tên bắt đầu là "Nguyễn"

import java.util.ArrayList;

public class ExecuteStudent {
    public static void main(String[] args) {
        Student st1 = new Student("Nguyễn Đức", "1");
        Student st2 = new Student("Lê Lợi", "2");
        Student st3 = new Student("Quang Trung", "3");
        Student st4 = new Student("Vệ Tử Phu", "4");
        Student st5 = new Student("Bà Trưng", "5");

        ArrayList<Student> arr = new ArrayList<>();
        arr.add(st1);
        arr.add(st2);
        arr.add(st3);
        arr.add(st4);
        arr.add(st5);

        System.out.println("Check arr: " +arr);
        
        for(int i = 0; i < arr.size(); i++ ) {
            if(arr.get(i).getName().startsWith("Nguyễn")) {
                System.out.println("Start with Nguyễn is: " + arr.get(i));
            }
        }

    }
}
