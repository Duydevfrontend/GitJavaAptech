package BTAptech;

import java.util.InputMismatchException;
import java.util.Scanner;

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

    Scanner sc = new Scanner(System.in);
    public void nhapThongTin() {
        try{
        System.out.print("Ma so sinh vien: " ); setMaSV(sc.nextInt());
        System.out.print("Ho ten sinh vien: "); setHoTen(sc.nextLine());
        System.out.print("Diem ly thuyet: "); setDiemLT(sc.nextDouble());
        System.out.print("Diem thuc hanh: "); setDiemTH(sc.nextDouble());}

        catch (InputMismatchException e){
            System.out.println("Error!");
        }
    }

    @Override
    public String toString() {
        return  "\nSinhVien{" +
                "maSV=" + maSV +
                ", hoTen='" + hoTen + '\'' +
                ", diemLT=" + diemLT +
                ", diemTH=" + diemTH +
                ", diemTB=" + diemTB(diemLT,diemTH) +
                '}';
    }
}

