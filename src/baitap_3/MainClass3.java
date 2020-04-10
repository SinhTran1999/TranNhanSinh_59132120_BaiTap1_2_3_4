package baitap_3;

public class MainClass3 {
    
    public static void main(String[] args) {
       SinhVienPoly svPoly1 = new SinhVienIT(6,9,7,"Trần Nhân Sinh","CNTT");
       
       System.out.println("\nSinh viên poly kế thừa sinh viên IT");
       svPoly1.xuat();

        System.out.println("\nSinh viên poly kế thừa sinh viên Biz");
        SinhVienPoly svPoly2 = new SinhVienBiz(10,10,"Nguyễn Văn Tiến","CNSH");
        svPoly2.xuat();
    }
    
}
