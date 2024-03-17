package chap7exercise;

public class ExecuteSinhVien {
    public static void main(String[] args) {
        System.out.println("Run");

        SinhVien it1 = new SinhVienIT(10,9);
        System.out.println("Sinhvien it score = " + it1.getScore());

        SinhVien ck1 = new SinhVienCoKhi(6, 9);
        System.out.println("Sinhvien ck score = " + ck1.getScore());

    }
}
