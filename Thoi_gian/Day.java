package Thoi_gian;
import java.util.Scanner;

public class Day {
    private int day, month, year;

    public Day() {
        day = month = year = 0;
    }
     public Day(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    Scanner sc = new Scanner(System.in);

    public void nhap() {
        System.out.print("Nhập ngày: ");
        day = sc.nextInt();
        while (day > 31 || day < 1) {
            System.out.println("Ngày không hợp lệ,Vui lòng nhập lại: ");
            day = sc.nextInt();
        }
        System.out.print("Nhập tháng: ");
        month = sc.nextInt();
        while (month > 12 || month < 1) {
            System.out.println("Tháng không hợp lệ,Vui lòng nhập lại: ");
            month = sc.nextInt();
        }
        System.out.print("Nhập năm: ");
        year = sc.nextInt();
        while (year <= 0) {
            System.out.println("Năm không hợp lệ,Vui lòng nhập lại: ");
            year = sc.nextInt();
        }
    }

    public void xuat() {
        System.out.println(day + "/" + month + "/" + year);
    }
}
