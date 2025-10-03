package Baitap.Kethua;

import java.util.Scanner;

public class Diem {
    protected int x, y;
    protected Scanner sc = new Scanner(System.in);

    protected Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    protected Diem() {
    }

    protected void nhap() {
        System.out.print("Nhập x: ");
        x = sc.nextInt();
        System.out.print("Nhập y: ");
        y = sc.nextInt();
    }
    protected void xuat(){
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
