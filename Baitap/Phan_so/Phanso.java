package Baitap.Phan_so;
import java.util.Scanner;
public class Phanso {
    Scanner sc = new Scanner(System.in);
    private int tu,mau;
    public Phanso(){
        tu = mau = 0;
    }
    public Phanso(int tu,int mau){
        this.tu = tu;
        this.mau = mau;
    }
    public int get_tu(){
        return tu;
    }
    public int get_mau(){
        return mau;
    }
    public void set_ps(int tu,int mau){
        this.tu = tu;
        this.mau = mau;
    }
    public void nhap(){
        System.out.print("Nhập tử: ");
        tu = sc.nextInt();
        System.out.println("Nhập mẫu");
        mau = sc.nextInt();
    }
    public void xuat(){
        System.out.println(tu + "/" + mau);
    }
    public void nghichDao(){
        tu = mau;
        mau = tu;
    }
    public Phanso tong(Phanso p){
        Phanso Tong = new Phanso();
        Tong.tu = tu*p.mau + p.tu*mau;
        Tong.mau = mau*p.mau;
        return Tong;
    }
}
