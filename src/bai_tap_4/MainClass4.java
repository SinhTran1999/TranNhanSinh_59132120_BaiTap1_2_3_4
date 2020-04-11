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
public class MainClass4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ChuyenXe noithanh1 = new XeNoiThanh(10, 100, "AH456", "Tran Nhan Sinh", "BCD145", 600000);
        ChuyenXe noithanh2= new XeNoiThanh(32, 140, "MD758", "Nguyen Van Tien", "CDH478", 300000);
        ChuyenXe noithanh3 = new XeNoiThanh(12, 300, "CK789", "Vo Tien Phuc", "LM789", 250000);
        
        ChuyenXe ngoaithanh1 = new XeNgoaiThanh("Pham Le Tan", 5, "MD1452", "Vo Tien Phuc", "MD478", 500000);
        ChuyenXe ngoaithanh2 = new XeNgoaiThanh("Vo Minh Quan", 2, "AH653", "Tran Thi Ai", "MK785", 100000);
        ChuyenXe ngoaithanh3 = new XeNgoaiThanh("Van Thien", 3, "BK4785", "Tran Nhan Sinh", "MD4562", 250000);
        
        QuanLyChuyenXe quanly = new QuanLyChuyenXe();
        quanly.themChuyenXe(noithanh1);
        quanly.themChuyenXe(ngoaithanh1);
        quanly.themChuyenXe(noithanh2);
        quanly.themChuyenXe(noithanh3);
        quanly.themChuyenXe(ngoaithanh2);
        quanly.themChuyenXe(ngoaithanh3);
        
        quanly.xuatDS();
        System.out.println("Tổng doanh thu nội thành: " + quanly.tinhDoanhThuNoiThanh());
        System.out.println("Tổng doanh thu ngoại thành: " + quanly.tinhDoanhThuNgoaiThanh());
        System.out.println("Tổng doanh thu cả hai loại xe: " + quanly.tinhDoanhThuHaiLoai());
    }
    
}
