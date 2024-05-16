/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test_Ass;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();

        char tiepTuc;
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
                    //System.out.print("Nhập số lượng sinh viên muốn nhập: ");
                  //  int soLuong = scanner.nextInt();
                 //   scanner.nextLine(); // Đọc kí tự newline

                    // Nhập thông tin cho số lượng sinh viên đã chọn
                 //   for (int i = 0; i < soLuong; i++) {
                    //    System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
                    //    SinhVien sv = new SinhVien("", "", 0, 0);
                     //   sv.Nhap();
                     //   danhSachSinhVien.add(sv);
                    //}

                    //   System.out.println("Nhập thông tin sinh viên:");
                    // SinhVien sv = new SinhVien("", "", 0, 0);
                    // sv.nhap();
                    // danhSachSinhVien.add(sv);
                    //  break;
                    // Nhập danh sách 10 sinh viên
                    for (int i = 0; i < 3; i++) {
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
                    // Sắp xếp danh sách sinh viên theo điểm trung bình
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
                case 5:
                    System.out.print("Nhập mã sinh viên cần tìm: ");
                    String maSV = scanner.nextLine();
                    boolean found = false;
                    for (SinhVien sinhVien : danhSachSinhVien) {
                        if (sinhVien.getMasv().equals(maSV)) {
                            System.out.println("Thông tin sinh viên cần tìm:");
                            sinhVien.xuat();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy sinh viên có mã " + maSV);
                    }
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ!");
            }

            System.out.print("Tiếp tục? (y/n): ");
            tiepTuc = scanner.nextLine().charAt(0);
        } while (tiepTuc == 'y' || tiepTuc == 'Y');
    }
}
