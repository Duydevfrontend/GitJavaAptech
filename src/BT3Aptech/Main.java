package BT3Aptech;
import BT3Aptech.HangThucPham;
import java.util.Scanner;

public class Main {
    public static void main(String[] args ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        HangThucPham tp = new HangThucPham();
        boolean th = true;
        System.out.println("Nhập mã hàng : ");
        tp.setMaHang(scanner.next());
        scanner.nextLine();
        System.out.println("Nhập tên hàng : ");
        tp.setTenHang(scanner.nextLine());
        System.out.println("Nhập đơn giá : ");
        tp.setDonGia(scanner.nextDouble());
        do {
            System.out.println("Nhập năm,tháng,ngày sản xuất : ");
            tp.setNSX(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
            System.out.println("nhập năm,tháng,ngày hết hạn : ");
            tp.setHSD(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        } while (tp.kiemTraNgay(th));
        System.out.println(tp);
        tp.kiemTraNgayHetHan();
    }
}
