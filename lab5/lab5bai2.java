/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class lab5bai2 {

    public static void main(String[] args) {

        ArrayList<String> danhSachHoTen = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Chọn chức năng:");
            System.out.println("1. Nhập danh sách họ và tên");
            System.out.println("2. Xuất danh sách vừa nhập");
            System.out.println("3. Xuất danh sách ngẫu nhiên");
            System.out.println("4. Sắp xếp giảm dần và xuất danh sách");
            System.out.println("5. Tìm và xóa họ tên nhập từ bàn phím");
            System.out.println("6. Kết thúc");
            System.out.print("Chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    nhapDanhSachHoTen(danhSachHoTen, scanner);
                    break;
                case 2:
                    xuatDanhSachHoTen(danhSachHoTen);
                    break;
                case 3:
                    xuatDanhSachNgauNhien(danhSachHoTen);
                    break;
                case 4:
                    sapXepVaXuatDanhSachGiamDan(danhSachHoTen);
                    break;
                case 5:
                    timVaXoaHoTen(danhSachHoTen, scanner);
                    break;
                case 6:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 6);
    }

    public static void nhapDanhSachHoTen(ArrayList<String> danhSachHoTen, Scanner scanner) {
        System.out.println("Nhập danh sách họ và tên (nhập 'end' để kết thúc):");
        while (true) {
            String hoTen = scanner.nextLine();
            if (hoTen.equals("end")) {
                break;
            }
            danhSachHoTen.add(hoTen);
        }
    }

    public static void xuatDanhSachHoTen(ArrayList<String> danhSachHoTen) {
        System.out.println("Danh sách họ và tên:");
        for (String hoTen : danhSachHoTen) {
            System.out.println(hoTen);
        }
    }

    public static void xuatDanhSachNgauNhien(ArrayList<String> danhSachHoTen) {
        Collections.shuffle(danhSachHoTen);
        System.out.println("Danh sách họ và tên ngẫu nhiên:");
        for (String hoTen : danhSachHoTen) {
            System.out.println(hoTen);
        }
    }

    public static void sapXepVaXuatDanhSachGiamDan(ArrayList<String> danhSachHoTen) {
        Collections.sort(danhSachHoTen);
        Collections.reverse(danhSachHoTen);
        System.out.println("Danh sách họ và tên sắp xếp giảm dần:");
        for (String hoTen : danhSachHoTen) {
            System.out.println(hoTen);
        }
    }

    public static void timVaXoaHoTen(ArrayList<String> danhSachHoTen, Scanner scanner) {
        System.out.print("Nhập họ tên cần xóa: ");
        String hoTenCanXoa = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < danhSachHoTen.size(); i++) {
            if (danhSachHoTen.get(i).equals(hoTenCanXoa)) {
                danhSachHoTen.remove(i);
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Đã xóa họ tên: " + hoTenCanXoa);
        } else {
            System.out.println("Không tìm thấy họ tên để xóa.");
        }

    }
}
