package Lythuyet.DaHinh.src;

public class main {
   public static void main(String[] args) {
        // DONGVAT[] dv = new DONGVAT[3]; // mảng 3 động vật

        // dv[0] = new DONGVAT(); // đối tượng cha
        // dv[1] = new CHO("Lulu", 15, "Vàng"); // đối tượng chó
        // dv[2] = new MEO("Doremon", 3, "Xanh"); // đối tượng mèo

        // // Dùng vòng lặp duyệt qua mảng
        // for (DONGVAT d : dv) {
        //     d.keu();
        //     d.xuat();
        //     System.out.println(); // xuống dòng cho dễ nhìn
        // }
        DONGVAT[] dv = new DONGVAT[2];
        dv[0] = new CHO("Lulu", 15, "Vàng");
        dv[1] = new MEO("Doremon", 3, "Xanh");

        for (DONGVAT dv1 : dv) {
            dv1.xuat();   // gọi phương thức chung
            dv1.keu();    // gọi phương thức ghi đè

            if (dv1 instanceof MEO) {
                MEO m = (MEO) dv1;
                m.meo();   // gọi phương thức riêng của mèo
            } else if (dv1 instanceof CHO) {
                CHO c = (CHO) dv1;
                c.sua();   // gọi phương thức riêng của chó
            }

            System.out.println(); // xuống dòng
        }
    }
}
