package BT4Aptech;

public class Vehicle {
    private String chuXe;
    private String loaiXe;
    private double triGiaXe;
    private int dungTichXylanh;

    public Vehicle() {}

    public Vehicle(String chuXe, String loaiXe, double triGiaXe, int dungTichXylanh) {
        this.chuXe = chuXe;
        this.loaiXe = loaiXe;
        this.triGiaXe = triGiaXe;
        this.dungTichXylanh = dungTichXylanh;
    }

    public double tinhThue() {
        double thue;
        if(dungTichXylanh < 100 ) thue=triGiaXe * 0.01;
        else if(dungTichXylanh >= 100 && dungTichXylanh <= 200) thue=triGiaXe * 0.03;
        else thue=triGiaXe * 0.05;
        return thue;
    }

    public String getChuXe() {
        return chuXe;
    }

    public void setChuXe(String chuXe) throws Exception {
        if (!chuXe.trim().equals(""))
            this.chuXe = chuXe;
        else
            throw new Exception("Lỗi!: Chủ xe không được để trống!");
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) throws Exception {
        if (!loaiXe.trim().equals(""))
            this.loaiXe = loaiXe;
        else
            throw new Exception("Lỗi!: Loại xe không được để trống!");
    }

    public double getTriGiaXe() {
        return triGiaXe;
    }

    public void setTriGiaXe(double triGiaXe) {
        if (triGiaXe >= 0)
            this.triGiaXe = triGiaXe;
        else
            this.triGiaXe = 0;
    }

    public int getDungTichXylanh() {
        return dungTichXylanh;
    }

    public void setDungTichXylanh(int dungTichXylanh) {
        if (dungTichXylanh >= 0)
        this.dungTichXylanh = dungTichXylanh;
        else
            this.dungTichXylanh = 0;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "chuXe='" + chuXe + '\'' +
                ", loaiXe='" + loaiXe + '\'' +
                ", triGiaXe=" + triGiaXe +
                ", dungTichXylanh=" + dungTichXylanh +
                ",thue= " + tinhThue() +
                '}';
    }
    void inThue(){
        System.out.printf(chuXe,loaiXe,dungTichXylanh,triGiaXe,tinhThue());
    }
}
