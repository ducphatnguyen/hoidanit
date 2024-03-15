package chapter5;

import chapter4.Student;

import java.util.ArrayList;

// Các method hay dùng:
//add : thêm phần tử vào cuối
//remove: xóa
//clear: xóa tất cả
//get: truy xuất phần tử tại vị trí


public class ArrayListLesson {
    public static void main(String[] args) {
        int a = 10;

//      Kiểu dữ liệu không nguyên thủy (ép kiểu)
        ArrayList<String> a1 = new ArrayList<>(); // generic . Java diamon v7 tự động đoán type bên phải
        ArrayList<Student> a3 = new ArrayList<Student>();

        a1.add("hello");
        a1.add("hello1");
        a1.add("hello2");
        a1.remove(1);

        System.out.println(a1); // [hello, hello2]
    }
}
