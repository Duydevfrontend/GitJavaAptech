package BTAptech;

public class SinhVien {
    private int maSV;
    private String hoTen;
    private double diemLT;
    private double diemTH;

    public double diemTB(double diemLT, double diemTH) {
        double diemTB = (diemLT + diemTH) / 2;

        return diemTB;
    }
    public SinhVien() {

    }

    public SinhVien(int maSV, String hoTen, double diemLT, double diemTH) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(double diemLT) {
        this.diemLT = diemLT;
    }

    public double getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(double diemTH) {
        this.diemTH = diemTH;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSV=" + maSV +
                ", hoTen='" + hoTen + '\'' +
                ", diemLT=" + diemLT +
                ", diemTH=" + diemTH +
                ", diemTB=" + diemTB(diemLT,diemTH) +
                '}';
    }
}

