package quanlykhodienthoai;

public class SmartPhone extends DIENTHOAI{
    private long PIN;
    private int RAM;
    private int ROM;
    private String CHIP;
    private String DOPHANGIAI;

    public SmartPhone() {
    }

    public SmartPhone(String MANHAPVAOKHO) {
        super(MANHAPVAOKHO);
    }

    public SmartPhone(long GIA) {
        super(GIA);
    }

    public SmartPhone(long PIN, int RAM, int ROM, String CHIP, String DOPHANGIAI, String MANHAPVAOKHO, String Ma_DT, String TEN, String NSX, String MAU, long GIA, Ngay_Nhap_Xuat_Kho ngaynhap_xuat_kho) {
        super(MANHAPVAOKHO, Ma_DT, TEN, NSX, MAU, GIA, ngaynhap_xuat_kho);
        this.PIN = PIN;
        this.RAM = RAM;
        this.ROM = ROM;
        this.CHIP = CHIP;
        this.DOPHANGIAI = DOPHANGIAI;
    }
    
    public long getPIN() {
        return PIN;
    }

    public void setPIN(long PIN) {
        this.PIN = PIN;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getROM() {
        return ROM;
    }

    public void setROM(int ROM) {
        this.ROM = ROM;
    }

    public String getCHIP() {
        return CHIP;
    }

    public void setCHIP(String CHIP) {
        this.CHIP = CHIP;
    }

    public String getDOPHANGIAI() {
        return DOPHANGIAI;
    }

    public void setDOPHANGIAI(String DOPHANGIAI) {
        this.DOPHANGIAI = DOPHANGIAI;
    }
    
     @Override
    public void Nhap(){
        
    }
    
    @Override
    public String toString() {
        return super.toString() +
                "\n Dung luong pin: " + PIN + 
                "\n Ram: " + RAM + 
                "\n Rom: " + ROM + 
                "\n Chip: " + CHIP + 
                "\n Do phan giai: " + DOPHANGIAI;
    } 
}
