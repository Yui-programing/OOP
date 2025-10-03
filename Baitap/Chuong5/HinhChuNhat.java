package Baitap.Chuong5;

public class HinhChuNhat extends HinhHoc {
    private double cd, cr;

    public  HinhChuNhat(double cd, double cr) {
        this.cd = cd;
        this.cr = cr;
    }

    public double getCD() {
        return cd;
    }

    public double getCR() {
        return cr;
    }

    @Override
    double tinhchuvi() {
        return (cd + cr) * 2;
    }

    @Override
    double tinhdientich() {
        return cd * cr;
    }

    @Override
    void nhap() {
        System.out.print("Chiều Dài: ");
        cd = sc.nextDouble();
        System.out.print("Chiều Rộng: ");
        cr = sc.nextDouble();

    }

    @Override
    void xuat() {
        System.out.println("Chiều Dài: " + cd);
        System.out.println("Chiều Rộng: " + cr);
        System.out.printf("Diện tích: %.2f\n", tinhdientich());
        System.out.printf("Chu Vi: %.2f\n", tinhchuvi());

    }
}
