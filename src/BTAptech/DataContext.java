package BTAptech;

import java.util.ArrayList;

public class DataContext {
    ArrayList<SinhVien> sv = new ArrayList<SinhVien>();
    DataContext() {
        SinhVien sv1 = new SinhVien(1, "Nguyen Thi Tan", 7.5, 8.0 );
        SinhVien sv2 = new SinhVien(2, "Tran Van Ngoc", 6.5, 8.5);

        sv.add(sv1);
        sv.add(sv2);

        System.out.println(sv);
    }

    public ArrayList<SinhVien> Get_DataAll(){
        return sv;
    }

    public void Add(SinhVien sinhVien) {
        if (sinhVien != null) {
            sv.add(sinhVien);
        }
    }
}
