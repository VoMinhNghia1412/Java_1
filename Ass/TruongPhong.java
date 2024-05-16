package Ass;

public class TruongPhong extends NhanVien {

    private double luongTrachNhiem;

    public TruongPhong(String ma, String hoTen, double luong, double luongTrachNhiem) {
        super(ma, hoTen, luong);
        this.luongTrachNhiem = luongTrachNhiem;
    }

    @Override
    public double getThuNhap() {
        return super.getLuong() + luongTrachNhiem;
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Lương trách nhiệm: " + luongTrachNhiem);
    }
}
