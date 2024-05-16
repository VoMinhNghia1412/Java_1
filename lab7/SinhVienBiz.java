/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author Admin
 */
public class SinhVienBiz extends SinhVienPoly {

    private double diemMarketing;
    private double diemQuanTri;

    public SinhVienBiz(String hoTen, String nganh, double diemMarketing) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemQuanTri = 6.8;
    }

    @Override
    public double getDiem() {

        return (diemMarketing + diemQuanTri) / 2;
    }
}
