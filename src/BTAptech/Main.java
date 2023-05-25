package BTAptech;
import javax.xml.crypto.Data;
import java.util.Scanner;
import java.util.ArrayList;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<SinhVien> sv = new ArrayList<SinhVien>();

            SinhVien sv1 = new SinhVien(1, "Nguyen Thi Tan", 7, 8);
            SinhVien sv2 = new SinhVien(2, "Tran Van Ngoc", 6, 8);
            SinhVien sv3 = new SinhVien();


            sv.add(sv1);
            sv.add(sv2);
            sv3.nhapThongTin();
            sv.add(sv3);


            System.out.println(sv);


    }
}
