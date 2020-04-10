package baitap_3;

public abstract class SinhVienPoly {
    protected String hoTen;
    protected String nganh;

    public SinhVienPoly() {
    }

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    
    public abstract double getDiem();
    
    public String getHocLuc() {
        if (getDiem() < 5) return "Yếu";
        else if(5 <= getDiem() && getDiem() < 6.5) 
            return "Trung bình";
        else if (6.5 <= getDiem() && getDiem() < 7.5) 
            return "Khá";
        else if (7.5 <= getDiem() && getDiem() < 9) 
            return "Giỏi";
        return "Xuất sắc";	
    }
    
    public void xuat() {
        System.out.println("Tên sinh viên : " + hoTen);
        System.out.println("Ngành học: " + nganh);
        System.out.println("Diểm trung bình " + getDiem());
        System.out.println("Học lực: " + getHocLuc());
    }
}
