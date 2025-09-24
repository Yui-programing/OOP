package Thoi_gian;
import java.util.Scanner;

public class Hour {
    private int hour, min, sec;
    Scanner sc = new Scanner(System.in);

    public Hour() {
        hour = min = sec = 0;
    }

    public Hour(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public void nhap() {
        System.out.print("Nhập giờ: ");
        hour = sc.nextInt();
        System.out.print("Nhập phút: ");
        min = sc.nextInt();
        System.out.print("Nhập giây: ");
        sec = sc.nextInt();
    }

    public void xuat() {
        System.out.println(hour + "h" + min + "p" + sec + "s");
    }
}
