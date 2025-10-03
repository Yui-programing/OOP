package Baitap.Thoi_gian;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Day {
    private int day, month, year;
    LocalDate today = LocalDate.now();
    public Day() {
         day = today.getDayOfMonth();
         month = today.getMonthValue();
         year = today.getYear();
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
