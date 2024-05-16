/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

import java.util.ArrayList;
import java.util.Scanner;

class SanPham {

    private String tenSp;
    private double donGia;
    private String hang;

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm:");
        tenSp = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm:");
        donGia = scanner.nextDouble();
        scanner.nextLine(); // Clear the input buffer
        System.out.println("Nhập hãng sản phẩm:");
        hang = scanner.nextLine();
    }

    public void xuat() {
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Giá sản phẩm: " + donGia);
        System.out.println("Hãng sản phẩm: " + hang);
    }

    public String getHang() {
        return hang;
    }
}

/**
 *
 * @author Admin
 */
public class lab6bai2 {

    public static void main(String[] args) {
        ArrayList<SanPham> danhSachSanPham = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập thông tin sản phẩm thứ " + (i + 1) + ":");
            SanPham sp = new SanPham();
            sp.nhap();
            danhSachSanPham.add(sp);
        }

        System.out.println("Các sản phẩm của hãng Nokia:");
        for (SanPham sp : danhSachSanPham) {
            if (sp.getHang().equalsIgnoreCase("Nokia")) {
                sp.xuat();
            }
        }
    }

}
