package quanlykhodienthoai;

public class Basic extends DIENTHOAI{
    private int PIN;
    private String ROM;

    public Basic() {
    }

    public Basic(String MANHAPVAOKHO) {
        super(MANHAPVAOKHO);
    }

    public Basic(long GIA) {
        super(GIA);
    }

    public Basic(int PIN, String ROM, String MANHAPVAOKHO, String Ma_DT, String TEN, String NSX, String MAU, long GIA, Ngay_Nhap_Xuat_Kho ngaynhap_xuat_kho) {
        super(MANHAPVAOKHO, Ma_DT, TEN, NSX, MAU, GIA, ngaynhap_xuat_kho);
        this.PIN = PIN;
        this.ROM = ROM;
    }

    public int getPIN() {
        return PIN;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }

    public String getROM() {
        return ROM;
    }

    public void setROM(String ROM) {
        this.ROM = ROM;
    }

     @Override
    public void Nhap(){
        
    }
    
    @Override
    public String toString() {
        return super.toString() +
                "\n Dung luong pin:  " + PIN + 
                "\n Rom: " + ROM;
    }
    
}
