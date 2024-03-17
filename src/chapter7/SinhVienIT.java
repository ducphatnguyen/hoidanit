package chapter7;

public class SinhVienIT extends SinhVien{
    private String language;

    public SinhVienIT (String id, String name, double price, double tax, String language) {
//      Gọi method xây dựng cha
        super(id, name, price, tax);
        this.language = language;
    }

    public void getMoney() {
        System.out.println("run get money");
//      Gọi method hàm cha
        super.info();
    }

    @Override
    void tinhDiem() {

    }

    public void info() {
        System.out.println("Run info from sinhvienIT");
    }

    public String getLanguage() {
        return this.language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }

}
