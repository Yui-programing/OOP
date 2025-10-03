package Baitap.Chuong5;

public class HinhTron extends HinhHoc {
    final double PI = 3.14;
    private double r;

    public HinhTron(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    @Override
    double tinhdientich() {
        return PI * r * r;
    }

    @Override
    double tinhchuvi() {
        return 2 * PI * r;
    }

    @Override
    void nhap() {
        System.out.print("Nhập bán kinh r = ");
        r = sc.nextDouble();
    }

    @Override
    void xuat() {
        System.out.println("Bán kính: " + r);
        System.out.printf("Diện Tích: %.2f\n", tinhdientich());
        System.out.printf("Chu Vi: %.2f\n", tinhchuvi());
    }
}
