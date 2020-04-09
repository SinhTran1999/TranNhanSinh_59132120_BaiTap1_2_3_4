package baitap_1;
public class NhanVien {
    String ten;
    int tuoi;
    String diaChi;
    double tienLuong;
    int tongGioLam;

    public NhanVien() {
    }

    public NhanVien(String ten, int tuoi, String diaChi, double tienLuong, int tongGioLam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongGioLam = tongGioLam;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    public int getTongGioLam() {
        return tongGioLam;
    }

    public void setTongGioLam(int tongGioLam) {
        this.tongGioLam = tongGioLam;
    }
    
    public void getThongTin(){
          System.out.println("Tên nhân viên : " + ten );
          System.out.println("Tuổi nhân viên : " + tuoi );
          System.out.println("Địa chỉ nhân viên : " + diaChi);
          System.out.println("Tiền lương nhân viên : " + tienLuong );
          System.out.println("Tổng số giờ làm : " + tongGioLam );
          System.out.println("Tiền thưởng : "+ tinhThuong());
    }
    
    public double tinhThuong(){
        if (tongGioLam < 100) 
            return 0;
        else if (100 <= tongGioLam && tongGioLam <200) 
            return tienLuong*0.1;
        return tienLuong*0.2;  
    }
            
}
