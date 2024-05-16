package Ass;

public class NhanVien implements Comparable<NhanVien> {

    protected String ma;
    protected String hoTen;
    protected double luong;

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public NhanVien() {
    }

    public NhanVien(String ma, String hoTen, double luong) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public String getMa() {
        return ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public double getThuNhap() {
        return luong;
    }

    public double getThueThuNhap() {
        double thuNhap = getThuNhap();
        if (thuNhap <= 9000000) {
            return 0;
        } else if (thuNhap <= 15000000) {
            return thuNhap * 0.1;
        } else {
            return thuNhap * 0.12;
        }
    }

    public void xuatThongTin() {
        System.out.println("Mã nhân viên: " + ma);
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Lương: " + luong);
    }

    @Override
    public int compareTo(NhanVien nv) {

        return this.hoTen.compareTo(nv.getHoTen());
    }
}
