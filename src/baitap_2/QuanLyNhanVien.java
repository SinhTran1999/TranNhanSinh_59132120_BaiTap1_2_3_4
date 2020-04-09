package baitap_2;
import baitap_1.NhanVien;

public class QuanLyNhanVien implements IQuanLy{
    NhanVien[] NV = new NhanVien[100];
    int n = 0;
    
    @Override
    public void themNV(NhanVien nv) {
        NV[n] = new NhanVien();
        NV[n] = nv;
        n++;
    }
    
    @Override
    public void inDS() {
        for(int i = 0; i<n; i++) {
            System.out.println("\nNhân viên thứ " + i);
            NV[i].getThongTin();
        }
    }
}
