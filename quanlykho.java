
package quanlykhodienthoai;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class quanlykho {
    private ArrayList<DIENTHOAI> quanlykho;
    Scanner sc = new Scanner(System.in);
    DIENTHOAI dt;
    
    public quanlykho(){
        super();
        quanlykho = new ArrayList<DIENTHOAI>();
    }
    
    public void NhapKho(){
        System.out.println("Menu");
        System.out.println("""                          
                           1. Dong didongCoDay
                           2. Dong Basic
                           3. Dong SmartPhone
                           0. Thoat""");
        System.out.print("Lua chon cua ban: ");
                int menu = sc.nextInt();
        
            switch(menu){
            case 1: //didongcoday
                    {
                        String MANHAPVAOKHO;
                        String Ma_DT;
                        String TEN;
                        String NSX;
                        String MAU;
                        long GIA;
                        
                            System.out.println("=== Ban dang nhap thong tin dien thoai DI DONG CO DAY vao kho ! ===");

                                 Ngay_Nhap_Xuat_Kho ngaynhapkho = new Ngay_Nhap_Xuat_Kho();
                                 System.out.print("Nhap nam hien tai: "); int namhientai = sc.nextInt();
        
                                //ngày
                                System.out.println("\nNhap ngay/thang/nam dien thoai duoc nhap vao kho!!!");
                                System.out.print("Nhap ngay: ");
                                ngaynhapkho.setNgay(sc.nextInt());
                                if(ngaynhapkho.getNgay()<1 || ngaynhapkho.getNgay()>31){
                                do{
                                    System.out.println("Ngay khong hop le!!!");
                                    System.out.print("Nhap lai: ");
                                    ngaynhapkho.setNgay(sc.nextInt());
                                }while(ngaynhapkho.getNgay()<1 || ngaynhapkho.getNgay()>31);
                                }else System.out.println("Ngay hop le!\n");

                                //tháng
                                System.out.print("Nhap thang: ");
                                ngaynhapkho.setThang(sc.nextInt());
                                if(ngaynhapkho.getThang()<1 || ngaynhapkho.getThang()>12){
                                do{
                                    System.out.println("Thang khong hop le!!!");
                                    System.out.print("Nhap lai: ");
                                    ngaynhapkho.setThang(sc.nextInt());
                                }while(ngaynhapkho.getThang()<1 || ngaynhapkho.getThang()>12);
                                }else System.out.println("Thang hop le!\n");
                                //năm
                                System.out.print("Nhap nam: ");
                                ngaynhapkho.setNam(sc.nextInt());
                                if(ngaynhapkho.getNam()<1973 || ngaynhapkho.getNam()>namhientai){
                                do{
                                    System.out.println("Nam khong hop le!!!");
                                    System.out.print("Nhap lai: ");
                                    ngaynhapkho.setNam(sc.nextInt());
                                }while(ngaynhapkho.getNam()<1973 || ngaynhapkho.getNam()>namhientai);
                                }else System.out.println("Nam hop le!\n");
                            
                                MANHAPVAOKHO = sc.nextLine();
                            System.out.print("ma nhap vao kho dien thoai: ");
                                MANHAPVAOKHO = sc.nextLine();
                                
                            System.out.print("ma dien thoai: ");
                                Ma_DT = sc.nextLine();
                                
                            System.out.print("nhap ten dien thoai: ");
                                TEN = sc.nextLine();

                            System.out.print("nhap nha san xuat dien thoai: ");
                                NSX = sc.nextLine();
                                
                            System.out.print("nhap mau dien thoai: ");
                                 MAU = sc.nextLine();
                                
                            System.out.print("nhap gia dien thoai: ");
                                GIA = sc.nextLong();
                            System.out.println("---"); 
                            
                            dt = new didongCoDay(MANHAPVAOKHO, Ma_DT, TEN, NSX, MAU, GIA, ngaynhapkho);
                            quanlykho.add(dt);
                            System.out.println("\n==================");
                            System.out.println("them thanh cong");
                            System.out.println("==================");
                        break;
                        }  
            case 2: //basic
                  {
                        String MANHAPVAOKHO;
                        String TEN;
                        String NSX;
                        String MAU;
                        int PIN;
                        String ROM;
                        long GIA;
                        String Ma_DT;
                            System.out.println("=== Ban dang nhap thong tin dien thoai BASIC vao kho ! ===");
                            
                                Ngay_Nhap_Xuat_Kho ngaynhapkho = new Ngay_Nhap_Xuat_Kho();
                            System.out.print("Nhap nam hien tai: "); int namhientai = sc.nextInt();
        
                                //ngày
                                System.out.println("\nNhap ngay/thang/nam dien thoai duoc nhap vao kho!!!");
                                System.out.print("Nhap ngay: ");
                                ngaynhapkho.setNgay(sc.nextInt());
                                if(ngaynhapkho.getNgay()<1 || ngaynhapkho.getNgay()>31){
                                do{
                                    System.out.println("Ngay khong hop le!!!");
                                    System.out.print("Nhap lai: ");
                                    ngaynhapkho.setNgay(sc.nextInt());
                                }while(ngaynhapkho.getNgay()<1 || ngaynhapkho.getNgay()>31);
                                }else System.out.println("Ngay hop le!\n");

                                //tháng
                                System.out.print("Nhap thang: ");
                                ngaynhapkho.setThang(sc.nextInt());
                                if(ngaynhapkho.getThang()<1 || ngaynhapkho.getThang()>12){
                                do{
                                    System.out.println("Thang khong hop le!!!");
                                    System.out.print("Nhap lai: ");
                                    ngaynhapkho.setThang(sc.nextInt());
                                }while(ngaynhapkho.getThang()<1 || ngaynhapkho.getThang()>12);
                                }else System.out.println("Thang hop le!\n");
                                //năm
                                System.out.print("Nhap nam: ");
                                ngaynhapkho.setNam(sc.nextInt());
                                if(ngaynhapkho.getNam()<1973 || ngaynhapkho.getNam()>namhientai){
                                do{
                                    System.out.println("Nam khong hop le!!!");
                                    System.out.print("Nhap lai: ");
                                    ngaynhapkho.setNam(sc.nextInt());
                                }while(ngaynhapkho.getNam()<1973 || ngaynhapkho.getNam()>namhientai);
                                }else System.out.println("Nam hop le!\n");
                            
                                MANHAPVAOKHO = sc.nextLine();
                            System.out.print("ma nhap vao kho dien thoai: ");
                                MANHAPVAOKHO = sc.nextLine();
                                
                            System.out.print("ma dien thoai: ");
                                Ma_DT = sc.nextLine();
                                
                            System.out.print("nhap ten dien thoai: ");
                                TEN = sc.nextLine();

                            System.out.print("nhap nha san xuat dien thoai: ");
                                NSX = sc.nextLine();
                                
                            System.out.print("nhap mau dien thoai: ");
                                 MAU = sc.nextLine();

                            System.out.print("nhap PIN dien thoai: ");
                                PIN = sc.nextInt();

                                ROM = sc.nextLine();
                            System.out.print("nhap ROM dien thoai: ");
                                ROM = sc.nextLine();
                                
                            System.out.print("nhap gia dien thoai: ");
                                GIA = sc.nextLong();
                            System.out.println("---"); 
                            
                            dt = new Basic(PIN, ROM, MANHAPVAOKHO, Ma_DT, TEN, NSX, MAU, GIA, ngaynhapkho);
                            quanlykho.add(dt);
                            System.out.println("them thanh cong");
                        break;
                        }               
            case 3: //smartphone
                   {
                        String MANHAPVAOKHO;
                        String TEN;
                        String NSX;
                        String MAU;
                        int PIN;
                        int RAM;
                        int ROM;
                        String CHIP;
                        String DOPHANGIAI;
                        long GIA;
                        String Ma_DT;
                            System.out.println("=== Ban dang nhap thong tin diưn thoai SMARTPHONE vao kho ! ===");
                            
                                Ngay_Nhap_Xuat_Kho ngaynhapkho = new Ngay_Nhap_Xuat_Kho();
                            System.out.print("Nhap nam hien tai: "); int namhientai = sc.nextInt();
        
                                //ngày
                                System.out.println("\nNhap ngay/thang/nam dien thoai duoc nhap vao kho!!!");
                                System.out.print("Nhap ngay: ");
                                ngaynhapkho.setNgay(sc.nextInt());
                                if(ngaynhapkho.getNgay()<1 || ngaynhapkho.getNgay()>31){
                                do{
                                    System.out.println("Ngay khong hop le!!!");
                                    System.out.print("Nhap lai: ");
                                    ngaynhapkho.setNgay(sc.nextInt());
                                }while(ngaynhapkho.getNgay()<1 || ngaynhapkho.getNgay()>31);
                                }else System.out.println("Ngay hop le!\n");

                                //tháng
                                System.out.print("Nhap thang: ");
                                ngaynhapkho.setThang(sc.nextInt());
                                if(ngaynhapkho.getThang()<1 || ngaynhapkho.getThang()>12){
                                do{
                                    System.out.println("Thang khong hop le!!!");
                                    System.out.print("Nhap lai: ");
                                    ngaynhapkho.setThang(sc.nextInt());
                                }while(ngaynhapkho.getThang()<1 || ngaynhapkho.getThang()>12);
                                }else System.out.println("Thang hop le!\n");
                                //năm
                                System.out.print("Nhap nam: ");
                                ngaynhapkho.setNam(sc.nextInt());
                                if(ngaynhapkho.getNam()<1973 || ngaynhapkho.getNam()>namhientai){
                                do{
                                    System.out.println("Nam khong hop le!!!");
                                    System.out.print("Nhap lai: ");
                                    ngaynhapkho.setNam(sc.nextInt());
                                }while(ngaynhapkho.getNam()<1973 || ngaynhapkho.getNam()>namhientai);
                                }else System.out.println("Nam hop le!\n");
                                
                                MANHAPVAOKHO = sc.nextLine();
                            System.out.print("ma nhap vao kho dien thoai: ");
                                MANHAPVAOKHO = sc.nextLine();
                                
                            System.out.print("ma dien thoai: ");
                                Ma_DT = sc.nextLine();
                                
                            System.out.print("nhap ten dien thoai: ");
                                TEN = sc.nextLine();

                            System.out.print("nhap nha san xuat dien thoai: ");
                                NSX = sc.nextLine();
                                
                            System.out.print("nhap mau dien thoai: ");
                                 MAU = sc.nextLine();

                            System.out.print("nhap PIN dien thoai: ");
                                PIN = sc.nextInt();

                            System.out.print("nhap RAM dien thoai:");
                                RAM = sc.nextInt();

                            System.out.print("nhap ROM dien thoai:");
                                ROM = sc.nextInt();

                            CHIP = sc.nextLine();
                            System.out.print("nhap CHIP dien thoai:");                     
                                CHIP = sc.nextLine();

                            System.out.print("Nhap Do phan giai dien thoai: ");
                                DOPHANGIAI = sc.nextLine();
                                
                            System.out.print("nhap gia dien thoai: ");
                                GIA = sc.nextLong();
                            System.out.println("---"); 
                            
                            dt = new SmartPhone(PIN, RAM, ROM, CHIP, DOPHANGIAI, MANHAPVAOKHO, Ma_DT, TEN, NSX, MAU, GIA, ngaynhapkho);
                            quanlykho.add(dt);
                            System.out.println("them thanh cong");
                            
                        break;
                        }    
            default:
                if(menu==0){
                    System.out.println("nhap sai, chuc nang khong ton tai");
                }else{
                    System.out.println("Da thoat");
                }
        }        
    }
    
    public void ngayXuatKho(){
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        System.out.println(" Thoi gian xuat kho: " + date);
    }
    
    public void inThongTin_TatCaDT(){
        for(DIENTHOAI dt : quanlykho){
            System.out.println(dt.toString());
        }
    }

    public void inThongTin_DT_didongCoDay(){
        for (DIENTHOAI dt : quanlykho) {
            if(dt instanceof didongCoDay)
                System.out.println("thong tin: "+dt.toString());
        }
    }
    
    public void inThongTin_DT_Basic(){
        for (DIENTHOAI dt : quanlykho) {
            if(dt instanceof Basic)
                System.out.println("thong tin: "+dt.toString());
        }
    }
    
    public void inThongTin_DT_SmartPhone(){
        for (DIENTHOAI dt : quanlykho) {
            if(dt instanceof SmartPhone)
                System.out.println("thong tin: "+dt.toString());
        }
    }
    
    public int KiemTraSoLuongTrongKho(){
         return this.quanlykho.size();
    }
    
    public void LamRongKho(){
        this.quanlykho.removeAll(quanlykho);
     }
    
    public void xoaDienThoai_theoMaNhapVaoKho(String maNhapVaoKho) {
        if(this.quanlykho.size()==0) { 
            System.out.println("Danh sach hien dang rong"); 
    } 
        for(int i=0;i<this.quanlykho.size();i++) { 
            DIENTHOAI dt = this.quanlykho.get(i); 
        if(dt.getMANHAPVAOKHO().equals(maNhapVaoKho)) { 
            this.quanlykho.remove(i); 
            System.out.println("Da Xoa");
            } 
        }
    }
    
    public void xoaDienThoai_theoMaDT(String maDT) {
        if(this.quanlykho.size()==0) { 
            System.out.println("Danh sach hien dang rong"); 
    } 
        for(int i=0;i<this.quanlykho.size();i++) { 
            DIENTHOAI dt = this.quanlykho.get(i); 
        if(dt.getMa_DT().equals(maDT)) { 
            this.quanlykho.remove(i); 
            System.out.println("Da Xoa !!!");
            } 
        }
    }
    
    public void xoaDienThoai_theoTen(String ten) {
        if(this.quanlykho.size()==0) { 
            System.out.println("Danh sach hien dang rong"); 
    } 
        for(int i=0;i<this.quanlykho.size();i++) { 
            DIENTHOAI dt = this.quanlykho.get(i); 
        if(dt.getTEN().equals(ten)) { 
            this.quanlykho.remove(i); 
            System.out.println("Da Xoa");
            } 
        }
    }
    
    public void timDienThoai_theoTen(String ten){
        for(DIENTHOAI dienthoai : quanlykho)
            if(dienthoai.getTEN().indexOf(ten)>=0)
            {
                System.out.println("thong tin dien thoai duoc tim theo ten: ");
                System.out.println(dienthoai);
            }
    }
    
    public void timDienThoai_theoMaNhapVaoKho(String maNhapVaoKho){
        for(DIENTHOAI dienthoai : quanlykho)
            if(dienthoai.getMANHAPVAOKHO().indexOf(maNhapVaoKho)>=0) 
            {
                System.out.println("thong tin dien thoai duoc tim theo ma nhap vao kho!! ");
                System.out.println(dienthoai);
            }
    }
 
    public void timDienThoai_theoMaDT(String maDT){
        for(DIENTHOAI dienthoai : quanlykho)
            if(dienthoai.getMa_DT().indexOf(maDT)>=0) 
            {
                System.out.println("Dien thoai duoc xuat kho theo ma dien thoai: ");
                System.out.println(dienthoai);
            }
    }
    
    public void SapXepTheoGiaGiam(){
        Collections.sort(quanlykho, new Comparator<DIENTHOAI>(){
            @Override
            public int compare(DIENTHOAI dt1, DIENTHOAI dt2) {
                if(dt1.getGIA()>dt2.getGIA()){
                    return -1;
                }else if(dt1.getGIA()<dt2.getGIA()){
                    return 1;
                }else
                    return 0;
            }
            
        });
    }
    
    public void SapXepTheoGiaTang(){
        Collections.sort(quanlykho, new Comparator<DIENTHOAI>(){
            @Override
            public int compare(DIENTHOAI dt1, DIENTHOAI dt2) {
                if(dt1.getGIA()<dt2.getGIA()){
                    return -1;
                }else if(dt1.getGIA()>dt2.getGIA()){
                    return 1;
                }else
                    return 0;
            }
            
        });
    }    
    
    public void XuatKho(String MaDT){
        timDienThoai_theoMaDT(MaDT);
        if(this.quanlykho.size()==0) { 
            System.out.println("Danh sach hien dang rong"); 
        } 
        for(int i=0;i<this.quanlykho.size();i++) { 
            DIENTHOAI dt = this.quanlykho.get(i); 
        if(dt.getMa_DT().equals(MaDT)) { 
            this.quanlykho.remove(i); 
            ngayXuatKho();
            System.out.println(" Da Xoa !!!");
            } 
        }        
    }
}
