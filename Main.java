import java.util.Scanner;
import Thoi_gian.Day;
import Thoi_gian.Hour;
import Phan_so.Phanso;
public class Main {
    public static void main(String[] args) {
        // Day time = new Day();
        // time.nhap();
        // time.xuat();
        // Hour tIme = new Hour();
        // tIme.nhap();
        // tIme.xuat();
        Phanso a = new Phanso(2,3);
        Phanso p = new Phanso(3,4);
        Phanso r = a.tong(p);
        r.xuat();
    }
}