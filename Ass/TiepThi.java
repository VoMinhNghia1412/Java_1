package Ass;

public class TiepThi extends NhanVien {

    private double doanhSoBanHang;
    private double tiLeHoaHong;

    public TiepThi(String ma, String hoTen, double luong, double doanhSoBanHang, double tiLeHoaHong) {
        super(ma, hoTen, luong);
        this.doanhSoBanHang = doanhSoBanHang;
        this.tiLeHoaHong = tiLeHoaHong;
    }

    @Override
    public double getThuNhap() {
        return super.getLuong() + doanhSoBanHang * tiLeHoaHong;
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Doanh số bán hàng: " + doanhSoBanHang);
        System.out.println("Tỉ lệ hoa hồng: " + tiLeHoaHong);
    }
}
