/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author Admin
 */
public class SinhVienIT_1 extends SinhVienPoly_1 {

    private double diemJava;

    public SinhVienIT_1(double diemJava, double diemHTML, double diemCSS, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemHTML = diemHTML;
        this.diemCSS = diemCSS;
    }

    public SinhVienIT_1(String hoTen, String nganh) {
        super(hoTen, nganh);
    }
    private double diemHTML;
    private double diemCSS;

    public SinhVienIT_1(String hoTen, String nganh, double diemJava, double diemHTML, double diemCSS) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemHTML = diemHTML;
        this.diemCSS = diemCSS;
    }

    
    

    @Override
    public double getDiem() {
        return (2 * diemJava + diemHTML + diemCSS) / 4;
    }
}
