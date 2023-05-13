package BTAptech;

public class SinhVien {
    private int maSV;
    private String hoTen;
    private double diemLT;
    private double diemTH;

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSV=" + maSV +
                ", hoTen='" + hoTen + '\'' +
                ", diemLT=" + diemLT +
                ", diemTH=" + diemTH +
                '}';
    }

    public SinhVien(int _maSV, String _hoTen, double _diemLT, double _diemTH) {
        this.maSV = _maSV;
        this.hoTen = _hoTen;
        this.diemLT = _diemLT;
        this.diemTH = _diemTH;
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
}

