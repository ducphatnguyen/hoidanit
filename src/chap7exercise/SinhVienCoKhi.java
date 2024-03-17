package chap7exercise;

public class SinhVienCoKhi extends SinhVien{

    private double scoreCNC;
    private double scorePLC;

    public SinhVienCoKhi(double scoreCNC, double scorePLC) {
        super();
        this.scoreCNC = scoreCNC;
        this.scorePLC = scorePLC;
    }

    public double getScoreCNC() {
        return this.scoreCNC;
    }
    public double getScorePLC() {
        return this.scorePLC;
    }
    public void setScoreCNC(double scoreCNC) {
        this.scoreCNC = scoreCNC;
    }
    public void setScorePLC(double scorePLC) {
        this.scorePLC = scorePLC;
    }
    @Override
    double getScore() {
        return (this.scoreCNC + this.scorePLC) / 2;
    }
}
