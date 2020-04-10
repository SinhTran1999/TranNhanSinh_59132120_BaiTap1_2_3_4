package baitap_3;

public class SinhVienBiz extends SinhVienPoly{
    private double diemMakerting;
    private double diemSales;

    public SinhVienBiz() {
    }

    public SinhVienBiz(double diemMakerting, double diemSales, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemMakerting = diemMakerting;
        this.diemSales = diemSales;
    }

   

    public double getDiemMakerting() {
        return diemMakerting;
    }

    public void setDiemMakerting(double diemMakerting) {
        this.diemMakerting = diemMakerting;
    }

    public double getDiemSales() {
        return diemSales;
    }

    public void setDiemSales(double diemSales) {
        this.diemSales = diemSales;
    }
    
    @Override
    public double getDiem() {

            return (2*diemMakerting + diemSales)/3;
    }
    
}
