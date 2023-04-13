package quanlykhodienthoai;
import java.util.Objects;

public abstract class DIENTHOAI implements Comparable<DIENTHOAI>{
    
    private String MANHAPVAOKHO;
    private String Ma_DT;
    private String TEN;
    private String NSX;
    private String MAU;
    private long GIA;
    private Ngay_Nhap_Xuat_Kho ngaynhap_xuat_kho;
    
    public DIENTHOAI() {
    }

    public DIENTHOAI(String MANHAPVAOKHO) {
        this.MANHAPVAOKHO = MANHAPVAOKHO;
    }

    public DIENTHOAI(long GIA) {
        this.GIA = GIA;
    }

    public DIENTHOAI(String MANHAPVAOKHO, String Ma_DT, String TEN, String NSX, String MAU, long GIA, Ngay_Nhap_Xuat_Kho ngaynhap_xuat_kho) {
        this.MANHAPVAOKHO = MANHAPVAOKHO;
        this.Ma_DT = Ma_DT;
        this.TEN = TEN;
        this.NSX = NSX;
        this.MAU = MAU;
        this.GIA = GIA;
        this.ngaynhap_xuat_kho = ngaynhap_xuat_kho;
    }

    public String getMANHAPVAOKHO() {
        return MANHAPVAOKHO;
    }

    public void setMANHAPVAOKHO(String MANHAPVAOKHO) {
        this.MANHAPVAOKHO = MANHAPVAOKHO;
    }

    public String getTEN() {
        return TEN;
    }

    public void setTEN(String TEN) {
        this.TEN = TEN;
    }

    public String getNSX() {
        return NSX;
    }

    public void setNSX(String NSX) {
        this.NSX = NSX;
    }

    public String getMAU() {
        return MAU;
    }

    public void setMAU(String MAU) {
        this.MAU = MAU;
    }

    public long getGIA() {
        return GIA;
    }

    public void setGIA(long GIA) {
        this.GIA = GIA;
    }

    public String getMa_DT() {
        return Ma_DT;
    }

    public void setMa_DT(String Ma_DT) {
        this.Ma_DT = Ma_DT;
    }

    abstract void Nhap();
    
    @Override
    public String toString() {
        return  "\n Ngay nhap kho: " + ngaynhap_xuat_kho +
                "\n Gia: " + GIA +
                "\n Ma nhap vao kho: " + MANHAPVAOKHO + 
                "\n Ma dien thoai: " + Ma_DT +
                "\n Ten dien thoai: " + TEN + 
                "\n Nha san xuat: " + NSX + 
                "\n Mau sac: " + MAU;
    }

    public int hashCode() {
        int hash;
        hash = Objects.hashCode(this.MANHAPVAOKHO);
        hash = Objects.hashCode(this.TEN);
        return hash;
    }

    public int compareTo(DIENTHOAI o) {
        return this.getMANHAPVAOKHO().compareTo(o.getMANHAPVAOKHO());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DIENTHOAI other = (DIENTHOAI) obj;
        if (!Objects.equals(this.MANHAPVAOKHO, other.MANHAPVAOKHO)) {
            return false;
        }
        return Objects.equals(this.TEN, other.TEN);
    }

    
    
}
