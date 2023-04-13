package quanlykhodienthoai;
public class Ngay_Nhap_Xuat_Kho {
    private int Ngay;
    private int Thang;
    private int Nam;

    public Ngay_Nhap_Xuat_Kho(){
    }
    public Ngay_Nhap_Xuat_Kho(int Ngay, int Thang, int Nam) {
        this.Ngay = Ngay;
        this.Thang = Thang;
        this.Nam = Nam;
    }

    public int getNgay() {
        return Ngay;
    }

    public void setNgay(int Ngay) {
        this.Ngay = Ngay;
    }

    public int getThang() {
        return Thang;
    }

    public void setThang(int Thang) {
        this.Thang = Thang;
    }

    public int getNam() {
        return Nam;
    }

    public void setNam(int Nam) {
        this.Nam = Nam;
    }

    @Override
    public String toString() {
        return Ngay +"/"+ Thang +"/"+ Nam;
    }
   
}
