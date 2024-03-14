package chapter4;

public class Student {

    String name;
    int age;

//  PTXD không đối số
    public Student() {

    }

//  PTXD có đối số
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void learnJava(){
        System.out.println("Learn Java with Youtube Hỏi Dân IT");
    }

}
