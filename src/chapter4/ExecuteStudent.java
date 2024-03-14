package chapter4;

public class ExecuteStudent {
    public static void main(String[] args) {
        System.out.println("Run Student");

//      Khai báo 1 object và gán đối tượng
//        Student st1 = new Student();
//        st1.name = "Duc";
//        st1.age = 25;
//        System.out.println("Student with name = " + st1.name + " and age = " + st1.age);
//
//        Student st2 = new Student();
//        st2.name = "Alex";
//        st2.age = 23;
//        System.out.println("Student with name = " + st2.name + " and age = " + st2.age);

        Student st1 = new Student();

        Student st2 = new Student("Duc", 26);
        st2.setName("Duc new setName");
        System.out.println("Check object: " + st2.getAge() + ": " + st2.getName());


    }
}
