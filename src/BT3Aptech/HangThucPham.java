package BT3Aptech;


import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class HangThucPham {
    private String maHang;
    private String tenHang;
    private double donGia;
    private Date ngaySanXuat;
    private Date ngayHetHan;

    public HangThucPham() {}

    public HangThucPham(String maHang, String tenHang, double donGia, Date ngaySanXuat, Date ngayHetHan) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
    }

    public void setMaHang(String maHang) throws Exception {
            if(!maHang.trim().equals("") || !maHang.trim().equals(null) )
                throw new Exception("Lỗi: Mã hàng rỗng!");
            else
                this.maHang = maHang;
        }


    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) throws Exception {
        if(!tenHang.trim().equals(null) || !tenHang.trim().equals(""))
            throw new Exception("Lỗi: Tên hàng không được để trống!");
        else
            this.tenHang = tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        if (donGia >= 0)
        this.donGia = donGia;
        else this.donGia = 0;
    }

    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(Date ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public Date getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(Date ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    @Override
    public String toString() {
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeVN);
        String str = numberFormat.format(donGia);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String str1 = simpleDateFormat.format(ngaySanXuat);
        String str2 = simpleDateFormat.format(ngayHetHan);

        return "Thông tin về thực phẩm: \n" +
                "Mã hàng : " + maHang +
                "\nTên hàng : '" + tenHang +
                "\nĐơn giá : " + str +
                "\nNgày sản xuất : " + str1 +
                "\nHạn sử dụng : " + str2
                ;
    }

    public void setNSX (int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1 , day);
        this.ngaySanXuat = calendar.getTime();
    }
    public void setHSD (int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1 , day);
        this.ngayHetHan = calendar.getTime();
    }

    public boolean kiemTraTenHang(boolean test2) {
        if(!this.getTenHang().trim().equals("")) {
            test2 = false;
        }else {
            System.out.println("Tên hàng hoá không được bỏ trống. Vui lòng nhập lại!");
        }
        return test2;
    }

    public boolean kiemTraNgay(boolean test) {
        if (this.getNgaySanXuat().compareTo(this.getNgayHetHan()) < 0) {
            test = false;
        }else {
            System.out.println("Ngày sản xuất không được nhỏ hơn ngày hết hạn!");
        }
        return test;
    }

    public void kiemTraNgayHetHan() {
        Date today = new Date();
        today.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String st = simpleDateFormat.format(today);
        if (this.getNgayHetHan().compareTo(today) < 0) {
            System.out.println("Hôm nay là ngày " + st + ", hàng hóa đã hết hạn ");
        } else {
            System.out.println("Hôm nay là ngày " + st + ", hàng hóa vẫn còn hạn ");
        }
    }
}
