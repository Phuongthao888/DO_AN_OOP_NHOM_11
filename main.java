package quanlykhodienthoai;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc_menu = new Scanner(System.in);
        quanlykho qlk = new quanlykho();
        int menu;
        do{       
                        System.out.println("\n Menu_quanlykho");
                        System.out.println("""
                                           1. Nhap kho 
                                           2. in toan bo thong tin trong kho 
                                           3. in thong tin dien thoai di dong co day co trong kho
                                           4. in thong tin dien thoai basic co trong kho
                                           5. in thong tin dien thoai smartphone co trong kho
                                           6. Kiem tra so luong dien thoai trong kho
                                           7. Xoa dien thoai theo ma nhap vao kho
                                           8. Xoa dien thoai theo ma dien thoai
                                           9. Xoa dien thoai theo ten
                                           10. Tim dien thoai theo ten
                                           11. Tim dien thoai theo ma nhap vao kho
                                           12. Tim dien thoai theo ma dien thoai
                                           13. Sap xep gia dien thoai giam dan
                                           14. Sap xep gia dien thoai tang dan
                                           15. Xuat kho
                                           0. Thoat """);
                        System.out.print("Lua chon cua ban: ");
                 
            menu = sc_menu.nextInt();
            switch(menu){
                case 1:
                    qlk.NhapKho();
                    break;
                    
                case 2:
                    if(qlk.KiemTraSoLuongTrongKho()==0){
                        System.out.println("\n==================");
                        System.out.println("Kho hien dang rong");
                        System.out.println("==================");
                    }else{
                        System.out.println("\n==================");
                        qlk.inThongTin_TatCaDT();
                        System.out.println("==================");
                        }
                    break;
                    
                case 3:
                    qlk.inThongTin_DT_didongCoDay();
                    break;
                    
                case 4:
                    qlk.inThongTin_DT_Basic();
                    break;
                    
                case 5:
                    qlk.inThongTin_DT_SmartPhone();
                    break;
                    
                case 6:
                    System.out.println("\n==================");
                    System.out.println("So luong dien thoai hien co trong kho: "+qlk.KiemTraSoLuongTrongKho());
                    System.out.println("==================");
                    break;
                    
                case 7:
                    String MANHAPVAOKHO;
                    System.out.println("""
                                        ==================
                                        Ma dien thoai didongCoDay bat dau = CD
                                        Ma dien thoai Basic bat dau = BS
                                        Ma dien thoai SmartPhone bat dau = SP
                                        Vi du: CD1, BS1, SP2,...
                                        ==================
                                        """);
                    MANHAPVAOKHO = sc_menu.nextLine();
                    System.out.print("Nhap ma nhap vao kho cua dien thoai can xoa: ");
                    MANHAPVAOKHO = sc_menu.nextLine();
                                
                    System.out.println("Ket qua xoa! ");
                    qlk.xoaDienThoai_theoMaNhapVaoKho(MANHAPVAOKHO);
                    break;
                
                case 8:
                    String Ma_DT;
                    Ma_DT = sc_menu.nextLine();
                    System.out.print("Nhap ma dien thoai can xoa: ");
                    Ma_DT = sc_menu.nextLine();
                    qlk.xoaDienThoai_theoMaDT(Ma_DT);
                    break;
                    
                case 9:
                    String TEN;
                    TEN = sc_menu.nextLine();
                    System.out.print("Nhap ten dien thoai can xoa: ");
                    TEN = sc_menu.nextLine();
                                
                    System.out.println("Ket qua xoa! ");
                    qlk.xoaDienThoai_theoTen(TEN);
                    break;
                    
                case 10:
                    TEN = sc_menu.nextLine();
                    System.out.print("Nhap ten dien thoai can tim: ");
                    TEN = sc_menu.nextLine();
                                
                    qlk.timDienThoai_theoTen(TEN);
                    break;
                    
                case 11:
                    MANHAPVAOKHO = sc_menu.nextLine();
                    System.out.println("""
                                        ==================
                                        Ma dien thoai didongCoDay bat dau = CD
                                        Ma dien thoai Basic bat dau = BS
                                        Ma dien thoai SmartPhone bat dau = SP
                                        Vi du: CD1, BS1, SP2,...
                                        ==================
                                        """);
                    System.out.print("Nhap ma nhap vao kho cua dien thoai can tim: ");
                    MANHAPVAOKHO = sc_menu.nextLine();
                                
                    qlk.timDienThoai_theoMaNhapVaoKho(MANHAPVAOKHO);
                    break;
                case 12:
                    Ma_DT = sc_menu.nextLine();
                    System.out.print("Nhap ma dien thoai can tim: ");
                    Ma_DT = sc_menu.nextLine();
                    qlk.timDienThoai_theoMaDT(Ma_DT);
                    break;
                    
                case 13:
                    qlk.SapXepTheoGiaGiam();
                    qlk.inThongTin_TatCaDT();
                    break;
                    
                case 14:
                    qlk.SapXepTheoGiaTang();
                    qlk.inThongTin_TatCaDT();
                    break;
                
                case 15:
                    System.out.print("Nhap ma dien thoai can xuat kho: ");
                    Ma_DT = sc_menu.nextLine();
                    Ma_DT = sc_menu.nextLine();
                    qlk.XuatKho(Ma_DT);
                    break;
                    
                default:
                    if(menu!=0){
                    System.out.println("\n==================");
                    System.out.println("nhap sai, chuc nang khong ton tai");
                    System.out.println("==================");
                    }else{
                    System.out.println("Da thoat");
                }
            }
        }while(menu!=0);
    }
}
