package quanlykhodienthoai;

public class didongCoDay extends DIENTHOAI{

    public didongCoDay() {
    }

    public didongCoDay(String MANHAPVAOKHO) {
        super(MANHAPVAOKHO);
    }

    public didongCoDay(long GIA) {
        super(GIA);
    }

    public didongCoDay(String MANHAPVAOKHO, String Ma_DT, String TEN, String NSX, String MAU, long GIA, Ngay_Nhap_Xuat_Kho ngaynhap_xuat_kho) {
        super(MANHAPVAOKHO, Ma_DT, TEN, NSX, MAU, GIA, ngaynhap_xuat_kho);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    @Override
    public void Nhap(){
        
    }
}
