/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_4;

/**
 *
 * @author Tran Nhan Sinh
 */
public class XeNgoaiThanh extends ChuyenXe{
    String noiDen;
    int soNgayDiDuoc;

    public XeNgoaiThanh(String noiDen, int soNgayDiDuoc, String maSo, String hoTen, String soXe, double doanhThu) {
        super(maSo, hoTen, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noidDen) {
        this.noiDen = noidDen;
    }

    public int getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    @Override
    public void xuatThongTin() {
        System.out.println("+ Mã số chuyến xe: " + maSo);
        System.out.println("\t- Họ tên tài xế: " + hoTenTaiXe);
        System.out.println("\t- Số xe: " + soXe);
        System.out.println("\t- Nơi đến: " + noiDen);
        System.out.println("\t- Số ngày đi được: " + soNgayDiDuoc + " ngày");
        System.out.println("\t- Doanh thu: " + doanhThu);
    }
    
    
}
