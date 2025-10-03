package Lythuyet.DaHinh.src;

class CHO extends DONGVAT {
    String maulong;

    public CHO() {
        super();
        this.maulong = "";
    }

    public CHO(String ten, float cannang, String maulong) {
        super(ten, cannang);
        this.maulong = maulong;
    }

    // phương thức riêng của CHO
    public void sua() {
        System.out.print("\nChó đang sủa: GAU GAU!!!");
    }

    @Override
    public void keu() {
        System.out.print("\nGAU GAU!!!");
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.print("\nMàu lông: " + maulong);
    }
}
