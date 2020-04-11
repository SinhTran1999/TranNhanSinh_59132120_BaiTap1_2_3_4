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
public class XeNoiThanh extends ChuyenXe{
    int soTuyen;
    double kmDiDuoc;

    public XeNoiThanh(int soTuyen, double kmDiDuoc, String maSo, String hoTenTaiXe, String soXe, double doanhThu) {
        super(maSo, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.kmDiDuoc = kmDiDuoc;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public double getKmDiDuoc() {
        return kmDiDuoc;
    }

    public void setKmDiDuoc(double kmDiDuoc) {
        this.kmDiDuoc = kmDiDuoc;
    }

    @Override
    public void xuatThongTin() {
        System.out.println("+ Mã số chuyến xe: " + maSo);
        System.out.println("\t- Họ tên tài xế: " + hoTenTaiXe);
        System.out.println("\t- Số xe: " + soXe);
        System.out.println("\t- Số tuyến: " + soTuyen);
        System.out.println("\t- Số km đi được: " + kmDiDuoc +" km");
        System.out.println("\t- Doanh thu: " + doanhThu);
    }
    
    
}
