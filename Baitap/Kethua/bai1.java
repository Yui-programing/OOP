package Baitap.Kethua;
public class bai1 {
    public static void main(String[] args) {
        DoanThang AB = new DoanThang();
        AB.nhap();
        AB.xuat();
        System.out.printf("%.2f\n",AB.khoangCach());
        AB.cungmau();
    }
}