/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        SanPham sp1 = new SanPham();
        SanPham sp2 = new SanPham();
        System.out.println("Nhập tên sản phẩm 1");
        sp1.nhap();
        System.out.println("Nhập tên sản phẩm 2");
        sp2.nhap();
        System.out.println("Thông tin sản phẩm 1");
        sp1.xuat();
        System.out.println("Thông tin sản phẩm 2");
        sp2.xuat();

    }
}
