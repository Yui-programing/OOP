package Lythuyet.DaHinh.src;

class MEO extends DONGVAT {
    String maulong;

    public MEO() {
        super();
        this.maulong = "";
    }

    public MEO(String ten, float cannang, String maulong) {
        super(ten, cannang);
        this.maulong = maulong;
    }

    // phương thức riêng của mèo
    public void meo() {
        System.out.print("\nMèo đang kêu: MEO MEO!!!");
    }

    @Override
    public void keu() {
        System.out.print("\nMEO MEO!!!");
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.print("\nMàu lông: " + maulong);
    }
}
