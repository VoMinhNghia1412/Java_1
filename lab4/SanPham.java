/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SanPham {

    private String tenSp;

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    private double donGia;
    private double giamGia;

    public SanPham() {
    }

    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public double getThuenhapkhau() {
        return 0.1 * donGia;

    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm");
        tenSp = scanner.nextLine();
        System.out.println("Nhập đơn giá");
        donGia = scanner.nextDouble();
        System.out.println("Nhập giảm giá");
        giamGia = scanner.nextDouble();

    }

    public void xuat() {
        System.out.println("Tên sản phẩm :" + tenSp);
        System.out.println("Giá sản phẩm  :" + donGia);
        System.out.println("Giảm giá sản phẩm :" + giamGia);
        System.out.println("Thuế sản phẩm :" + getThuenhapkhau());

    }

    public static void main(String[] args) {
        SanPham sp1 = new SanPham("Áo", 100, 5);
        SanPham sp2 = new SanPham("Quần ", 150, 10);
        System.out.println("Thông tin sản phẩm 1 ");
        sp1.xuat();
        System.out.println("Thông tin sản phẩm 2 ");
        sp2.xuat();

    }
}
