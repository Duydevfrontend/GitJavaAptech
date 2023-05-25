package BTAptech;

import org.w3c.dom.ls.LSOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SinhVien {
    private int maSV;
    private String hoTen;
    private float diemLT;
    private float diemTH;

    public float diemTB(float diemLT, float diemTH) {
        float diemTB = (diemLT + diemTH) / 2;

        return diemTB;
    }
    public SinhVien() {

    }

    public SinhVien(int maSV, String hoTen, float diemLT, float diemTH) {
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

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public double getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    Scanner sc = new Scanner(System.in);
    public void nhapThongTin() {
        try{
        System.out.print("Ma so sinh vien: " ); setMaSV(sc.nextInt());
        sc.nextLine();
        System.out.print("Ho ten sinh vien: "); setHoTen(sc.nextLine());
        System.out.print("Diem ly thuyet: "); setDiemLT(sc.nextFloat());
        System.out.print("Diem thuc hanh: "); setDiemTH(sc.nextFloat());}

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

