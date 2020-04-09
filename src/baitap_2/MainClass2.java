package baitap_2;
import baitap_1.NhanVien;
public class MainClass2 {

   
    public static void main(String[] args) {
        QuanLyNhanVien ds = new QuanLyNhanVien();
        NhanVien NV1 = new NhanVien("Võ Thị Sơn Hà",22,"Sài Gòn",2500000,150);
        NhanVien NV2 = new NhanVien("Vũ Quang Hà",20,"Bình Thuận",9800000.0,240);
        NhanVien NV3 = new NhanVien("Đoàn Kim Dung",30,"Hà Nội",32000000,350);
        NhanVien NV4 = new NhanVien("Đoàn Thế Dự",26,"Quảng Ngãi",2700000,230);
        NhanVien NV5 = new NhanVien("Trần Kim Hải",33,"Lâm Đồng",2400000,250);
        NhanVien NV6 = new NhanVien("Đoàn Thế Dự",26,"Quảng Ngãi",2700000,230);
        NhanVien NV7 = new NhanVien("Trần Kim Dung",33,"An Khue",2400000,250);
        
        ds.themNV(NV1);
        ds.themNV(NV2);
        ds.themNV(NV3);
        ds.themNV(NV4);
        ds.themNV(NV5);
        ds.themNV(NV6);
        ds.themNV(NV7);
       
        for (int i=0; i<7; i++){
            System.out.println("\nNhân viên thứ " + i);
            ds.NV[i].getThongTin();
        }
    }
    
}
