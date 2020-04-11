/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_4;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class QuanLyChuyenXe implements IQuanLyChuyeXe{
    ArrayList<ChuyenXe> dsChuyenXe;

    public QuanLyChuyenXe() {
        dsChuyenXe = new ArrayList();
    }

    @Override
    public void themChuyenXe(ChuyenXe cx) {
        dsChuyenXe.add(cx);
    }

    @Override
    public void xuatDS() {
        int size = dsChuyenXe.size();
        for(int i = 0; i < size; i++){
            dsChuyenXe.get(i).xuatThongTin();
        }
    }

    @Override
    public double tinhDoanhThuHaiLoai() {
        double sum = 0;
        int size = dsChuyenXe.size();
        for(int i = 0; i < size; i++){
            sum += dsChuyenXe.get(i).getDoanhThu();
        }
        return sum;
    }

    @Override
    public double tinhDoanhThuNoiThanh() {
        double sum = 0;
        int size = dsChuyenXe.size();
        for(int i = 0; i < size; i++){
            ChuyenXe temp = dsChuyenXe.get(i);
            if(temp instanceof XeNoiThanh)
                sum += temp.getDoanhThu();
        }
        return sum;
    }

    @Override
    public double tinhDoanhThuNgoaiThanh() {
        double sum = 0;
        int size = dsChuyenXe.size();
        for(int i = 0; i < size; i++){
            ChuyenXe temp = dsChuyenXe.get(i);
            if(temp instanceof XeNgoaiThanh)
                sum += temp.getDoanhThu();
        }
        return sum;
    }  
}
