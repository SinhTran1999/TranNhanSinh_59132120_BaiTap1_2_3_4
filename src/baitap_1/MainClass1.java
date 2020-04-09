package baitap_1;

public class MainClass1 {

    public static void main(String[] args) {
       NhanVien NV1 = new NhanVien("Trần Nhân Sinh",21,"Phú Yên",650000,1500);
       NhanVien NV2 = new NhanVien("Võ Tiến Phúc",29,"Đà Nẵng",450000,2500);
       NhanVien NV3 = new NhanVien("Lê Thế Tài",18,"Đăk Lăk",350000,2200);
       NhanVien NV4 = new NhanVien("Võ Kim Phụng",26,"Vĩnh Thọ",850000,3500);
       NhanVien NV5 = new NhanVien("Võ Tiến Mai",29,"Đà Nẵng",450000,2500);
        
        NV1.getThongTin();
        NV2.getThongTin();
        NV3.getThongTin();
        NV4.getThongTin();
        NV5.getThongTin();
    }
}
