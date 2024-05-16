/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SanPham {

    String ten;
    double gia;

    public SanPham(String ten, double gia) {
        this.ten = ten;
        this.gia = gia;
    }
}

/**
 *
 * @author Admin
 */
public class lab5bai3 {

    static ArrayList<SanPham> danhSachSanPham = new ArrayList<>();

    public static void main(String[] args) {

        menu();
    }

    static void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("===== MENU =====");
            System.out.println("1. Nhập danh sách sản phẩm từ bàn phím");
            System.out.println("2. Sắp xếp giảm dần theo giá và xuất ra màn hình");
            System.out.println("3. Tìm và xóa sản phẩm theo tên nhập từ bàn phím");
            System.out.println("4. Xuất giá trung bình của các sản phẩm");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    nhap();
                    break;
                case 2:
                    sapxep();
                    break;
                case 3:
                    xoa();
                    break;
                case 4:
                    tinhGiaTrungBinh();
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        }
    }

    static void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng sản phẩm: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập tên sản phẩm thứ " + (i + 1) + ": ");
            String ten = scanner.nextLine();
            System.out.print("Nhập giá sản phẩm: ");
            double gia = scanner.nextDouble();
            danhSachSanPham.add(new SanPham(ten, gia));
        }
    }

    static void xuat() {
        for (SanPham sp : danhSachSanPham) {
            System.out.println("Tên: " + sp.ten + ", Giá: " + sp.gia);
        }
    }

    static void sapxep() {
        Comparator<SanPham> comp = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return Double.compare(o2.gia, o1.gia);
            }
        };
        Collections.sort(danhSachSanPham, comp);
        xuat();
    }

    static void xoa() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm cần xóa: ");
        String ten = scanner.nextLine();

        for (int i = 0; i < danhSachSanPham.size(); i++) {
            if (danhSachSanPham.get(i).ten.equalsIgnoreCase(ten)) {
                danhSachSanPham.remove(i);
                System.out.println("Đã xóa sản phẩm có tên " + ten);
                
            }
        }
        System.out.println("Không tìm thấy sản phẩm có tên " + ten);
    }

    static void tinhGiaTrungBinh() {
        if (danhSachSanPham.isEmpty()) {
            System.out.println("Danh sách sản phẩm trống.");
            return;
        }
        double tongGia = 0;
        for (SanPham sp : danhSachSanPham) {
            tongGia += sp.gia;
        }
        double giaTrungBinh = tongGia / danhSachSanPham.size();
        System.out.println("Giá trung bình của các sản phẩm là: " + giaTrungBinh);
    }
}
