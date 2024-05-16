/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author Admin
 */
public class SinhVienIT extends SinhVienPoly {

    private double diemJava;
    private double diemCSS;
    private double diemHTML;

    public SinhVienIT(String hoTen, String nganh, double diemJava) {
        super(hoTen, nganh);
        this.diemJava = diemJava;

        this.diemCSS = 8.0;
        this.diemHTML = 7.5;
    }

    @Override
    public double getDiem() {

        return (diemJava + diemCSS + diemHTML) / 3;
    }

}
