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
public abstract class ChuyenXe {
    protected String maSo;
    protected String hoTenTaiXe;
    protected String soXe;
    protected double doanhThu;

    public ChuyenXe() {
    }

    public ChuyenXe(String maSo, String hoTen, String soXe, double doanhThu) {
        this.maSo = maSo;
        this.hoTenTaiXe = hoTen;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }

    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    public abstract void xuatThongTin();
    
}
