package chapter8;

public class ExecuteStudent {
    public static void main(String[] args) {
        System.out.println("Student");
        Student st1 = new Student("123", "Đức", 23, 9);
        st1.setGrade();
        System.out.println(st1);

        Person p1 = new Person("234", "Đứccc", 23);
        System.out.println(p1);
    }
}
