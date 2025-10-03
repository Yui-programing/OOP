package Baitap.Chuong5;

public class main {
    public static void main(String[] args) {
        HinhHoc[] arr = new HinhHoc[2];
        arr[0] = new HinhTron(5);
        arr[1] = new HinhChuNhat(3, 4);
        if (arr[0] instanceof HinhTron) {
            System.out.println("Hình Tròn");
            arr[0].xuat();
        } else
            System.err.println("Nope");
        if (arr[1] instanceof HinhChuNhat) {
            System.out.println("Hình Chữ Nhật");
            arr[1].xuat();
        } else
            System.err.println("Nope");
    }
}
