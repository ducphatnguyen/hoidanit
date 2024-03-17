package chapter7;

public class ExecuteSinhVien {
    public static void main(String[] args) {
        System.out.println("Run 111");

//      Sinh viên IT
        SinhVienIT svit1 = new SinhVienIT("123", "Duc", 10.0, 0.1, "Java");
        System.out.println("check: " + svit1.id);

//      Sinh viên Cơ Khí
        SinhVienCoKhi svck1 = new SinhVienCoKhi("123", "Duc2", 10.0, 0.1, "Machine");
        System.out.println("check: " + svck1.name);
    }
}
