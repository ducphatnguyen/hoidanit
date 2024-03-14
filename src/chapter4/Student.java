package chapter4;

// Key: this có nghĩa là ánh xạ tới đối tượng hiện tại
public class Student {

    private String name;
    private int age;

//  PTXD không đối số
    public Student() {

    }

//  PTXD có đối số
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void learnJava(){
        System.out.println("Learn Java with Youtube Hỏi Dân IT");
    }

}
