package Baitap.Kethua;
import java.math.*;

public class DoanThang {
    private DiemMau mau1 = new DiemMau();
    private DiemMau mau2 = new DiemMau();

    protected DoanThang() {
    };

    protected DoanThang(DiemMau mau1, DiemMau mau2) {
        this.mau1 = mau1;
        this.mau2 = mau2;
    }

    public void nhap() {
        System.out.println("Màu 1: ");
        mau1.nhap();
        System.out.println("Màu 2: ");
        mau2.nhap();
    }

    public void xuat() {
        System.out.print("Màu 1: ");
        mau1.xuat();
        System.out.println("Màu 2: ");
        mau2.xuat();
       }

    public double khoangCach() {
        double kc = Math.sqrt(Math.pow(mau2.x - mau1.x, 2) + Math.pow(mau2.y - mau1.y, 2)); //nên tạo hàm getx gety trong diem
        return kc;
    }

    public void cungmau() {
        if (mau1.mau == mau2.mau) {
            System.out.println("2 điểm cùng màu");
        } else
            System.out.println("2 điểm không cùng màu");
    }

}
