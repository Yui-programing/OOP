package Lythuyet.DaHinh.src;

public class DONGVAT {
    String ten;
    float cannang;

    // Constructor mặc định
    public DONGVAT() {
        this.ten = "DV";
        this.cannang = 0;
    }

    // Constructor có tham số
    public DONGVAT(String t, float cn) {
        this.ten = t;
        this.cannang = cn;
    }

    // Phương thức kêu
    public void keu() {
        System.out.print("\nAAA!!!");
    }

    // Phương thức xuất
    public void xuat() {
        System.out.print("\nTen: " + ten + "\nCan nang: " + cannang + " Kg");
    }
}
