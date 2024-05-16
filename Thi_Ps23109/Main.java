/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thi_Ps23109;

import java.awt.datatransfer.DataFlavor;
import java.util.ArrayList;
import java.util.Scanner;
import javax.sound.midi.SysexMessage;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();
        char tieptuc;
        do {
            System.out.println("Menu:");
            System.out.println("1. Nhập sinh viên");
            System.out.println("2. Xuất danh sách sinh viên");
            System.out.println("3. Xếp loại sinh viên theo điểm trung bình");
            System.out.println("4. Xuất danh sách sinh viên xếp loại từ khá trở lên");
            System.out.println("5. Tìm kiếm sinh viên theo mã sinh viên");
            System.out.println("0. Thoát");

            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc kí tự newline

            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng sinh viên muốn nhập: ");
                    int soLuong = scanner.nextInt();
                    scanner.nextLine();

                    for (int i = 0; i < soLuong; i++) {
                        System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
                        SinhVien sv = new SinhVien("", "", 0, 0);
                        sv.nhap();
                        danhSachSinhVien.add(sv);
                    }

                case 2:
                    System.out.println("Danh sách sinh viên:");
                    for (SinhVien sinhVien : danhSachSinhVien) {
                        sinhVien.xuat();
                    }
                    break;
                case 3:
                    System.out.println("Danh sách sinh viên sau khi xếp loại:");

                    danhSachSinhVien.sort((sv1, sv2) -> Double.compare(sv2.getDiemTrungBinh(), sv1.getDiemTrungBinh()));
                    for (SinhVien sinhVien : danhSachSinhVien) {
                        sinhVien.xuat();
                    }
                    break;
                case 4:
                    System.out.println("Danh sách sinh viên xếp loại từ khá trở lên:");
                    for (SinhVien sinhVien : danhSachSinhVien) {
                        if (sinhVien.xepLoai().equals("Khá") || sinhVien.xepLoai().equals("Giỏi")) {
                            sinhVien.xuat();
                        }
                    }
                    break;
            }

            System.out.print("Tiếp tục? (y/n): ");
            tieptuc = scanner.nextLine().charAt(0);
        } while (tieptuc == 'y' || tieptuc == 'Y');
    }
}
