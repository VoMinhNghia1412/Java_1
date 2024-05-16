/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class SinhVien {

    private String hoTen;
    private String email;
    private String soDienThoai;
    private String cmnd;

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ tên sinh viên:");
        hoTen = scanner.nextLine();

        while (true) {
            System.out.println("Nhập email:");
            email = scanner.nextLine();
            if (kiemTraEmail(email)) {
                break;
            } else {
                System.out.println("Email không hợp lệ. Vui lòng nhập lại.");
            }
        }

        while (true) {
            System.out.println("Nhập số điện thoại:");
            soDienThoai = scanner.nextLine();
            if (kiemTraSoDienThoai(soDienThoai)) {
                break;
            } else {
                System.out.println("Số điện thoại không hợp lệ. Vui lòng nhập lại.");
            }
        }

        // Nhập và kiểm tra định dạng CMND
        while (true) {
            System.out.println("Nhập số CMND:");
            cmnd = scanner.nextLine();
            if (kiemTraCMND(cmnd)) {
                break;
            } else {
                System.out.println("Số CMND không hợp lệ. Vui lòng nhập lại.");
            }
        }
    }

    public void xuat() {
        System.out.println("Họ tên sinh viên: " + hoTen);
        System.out.println("Email: " + email);
        System.out.println("Số điện thoại: " + soDienThoai);
        System.out.println("CMND: " + cmnd);
    }

    private boolean kiemTraEmail(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private boolean kiemTraSoDienThoai(String soDienThoai) {
        String regex = "^\\d{10,11}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(soDienThoai);
        return matcher.matches();
    }

    // Hàm kiểm tra định dạng CMND
    private boolean kiemTraCMND(String cmnd) {
        String regex = "^\\d{9,12}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cmnd);
        return matcher.matches();
    }
}

/**
 *
 * @author Admin
 */
public class lab6bai4 {

    public static void main(String[] args) {
        SinhVien[] danhSachSinhVien = new SinhVien[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            danhSachSinhVien[i] = new SinhVien();
            danhSachSinhVien[i].nhap();
        }

        System.out.println("Thông tin các sinh viên:");
        for (SinhVien sv : danhSachSinhVien) {
            sv.xuat();
            System.out.println();
        }
    }
}
