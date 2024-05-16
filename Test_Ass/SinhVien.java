/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test_Ass;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SinhVien {

    String hotensv;
    String masv;
    double diemjava1;
    double diemjava2;

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

    public double getDiemjava1() {
        return diemjava1;
    }

    public void setDiemjava1(double diemjava1) {
        this.diemjava1 = diemjava1;
    }

    public double getDiemjava2() {
        return diemjava2;
    }

    public void setDiemjava2(double diemjava2) {
        this.diemjava2 = diemjava2;
    }

    public SinhVien(String hotensv, String masv, double diemjava1, double diemjava2) {
        this.hotensv = hotensv;
        this.masv = masv;
        this.diemjava1 = diemjava1;
        this.diemjava2 = diemjava2;
    }

    public SinhVien() {
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ tên sinh viên ");
        hotensv = scanner.nextLine();
        System.out.println("Nhập mã sinh viên ");
        masv = scanner.nextLine();
        System.out.println("Nhập điểm java_1 ");
        diemjava1 = scanner.nextDouble();
        System.out.println("Nhập điểm java_2 ");
        diemjava2 = scanner.nextDouble();

    }

    public void xuat() {
        System.out.println("Thông tin sinh viên  ");
        System.out.println("Họ tên sinh viên " + hotensv);
        System.out.println("Mã sinh viên " + masv);
        System.out.println("Điểm java_1 " + diemjava1);
        System.out.println("Điểm java_2 " + diemjava2);

    }

    public double getDiemTrungBinh() {
        return Math.round((diemjava1 + diemjava2) / 2 * 10.0) / 10.0;
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
