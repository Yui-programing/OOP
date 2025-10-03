package Baitap.Kethua;

public class DiemMau extends Diem {
    protected int mau;
    public DiemMau(int x, int y,int mau){
        super(x,y);
        this.mau = mau;
    }
    public DiemMau(){};
    public void nhap(){
        super.nhap();
        System.out.print("Màu: ");
        mau = sc.nextInt();
    }
    public void xuat(){
        super.xuat();
        System.out.println("màu: " + mau);
    }
}
