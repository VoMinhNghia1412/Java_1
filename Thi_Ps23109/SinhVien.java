/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thi_Ps23109;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SinhVien {

    String hotensv;
    String masv;
    double diemHTML;
    double diemJava;

    public String getHotensv() {
        return hotensv;
    }

    public void setHotensv(String hotensv) {
        this.hotensv = hotensv;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public double getDiemHTML() {
        return diemHTML;
    }

    public void setDiemHTML(double diemHTML) {
        this.diemHTML = diemHTML;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public SinhVien(String hotensv, String masv, double diemHTML, double diemJava) {
        this.hotensv = hotensv;
        this.masv = masv;
        this.diemHTML = diemHTML;
        this.diemJava = diemJava;
    }

    public SinhVien() {
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ tên sinh viên ");
        hotensv = scanner.nextLine();
        System.out.println("Nhập mã sinh viên  ");
        masv = scanner.nextLine();
        System.out.println("Nhập điêm HTML ");
        diemHTML = scanner.nextDouble();
        System.out.println("Nhập điểm java ");
        diemJava = scanner.nextDouble();
    }

    public void xuat() {
        System.out.println("Họ tên sinh viên " + hotensv);
        System.out.println("Mã sinh viên " + masv);
        System.out.println("Điểm html  " + diemHTML);
        System.out.println("Điểm java " + diemJava);

    }

    public double getDiemTrungBinh() {
        return Math.round((diemHTML + diemJava) / 2 * 10.0) / 10.0;
    }

    public String xepLoai() {
        double diemTB = getDiemTrungBinh();
        if (diemTB >= 9) {
            return "Giỏi";
        } else if (diemTB >= 7) {
            return "Khá";
        } else if (diemTB >= 5) {
            return "Trung bình";
        } else {
            return "Yếu";
        }

    }

}
