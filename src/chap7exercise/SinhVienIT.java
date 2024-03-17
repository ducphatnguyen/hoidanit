package chap7exercise;

public class SinhVienIT extends SinhVien{
    private double scoreJava;
    private double scoreHTML;

    public SinhVienIT(double scoreJava, double scoreHTML) {
        super();
        this.scoreJava = scoreJava;
        this.scoreHTML = scoreHTML;
    }

    public double getScoreHTML() {
        return this.scoreHTML;
    }
    public double getScoreJava() {
        return this.scoreJava;
    }
    public void setScoreHTML(double scoreHTML) {
        this.scoreHTML = scoreHTML;
    }
    public void setScoreJava(double scoreJava) {
        this.scoreJava = scoreJava;
    }
    @Override
    double getScore() {
        return (this.scoreJava + this.scoreHTML) / 2;
    }


}
