package BTAptech;
import javax.xml.crypto.Data;
import java.util.Scanner;
import java.util.ArrayList;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        ArrayList<SinhVien> sv = new ArrayList<SinhVien>();

            SinhVien sv1 = new SinhVien(1, "Nguyen Thi Tan", 7.5, 8.0);
            SinhVien sv2 = new SinhVien(2, "Tran Van Ngoc", 6.5, 8.5);

            sv.add(sv1);
            sv.add(sv2);

            System.out.println(sv);


    }
}
