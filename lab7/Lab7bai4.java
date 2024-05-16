/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

abstract class SinhVienPoly {

    protected String hoTen;
    protected String nganh;

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public abstract double getDiem();

    public String getHocLuc() {
        double diem = getDiem();
        if (diem < 5) {
            return "Yếu";
        } else if (diem < 6.5) {
            return "Trung bình";
        } else if (diem < 7.5) {
            return "Khá";
        } else if (diem < 9) {
            return "Giỏi";
        } else {
            return "Xuất sắc";
        }
    }

    public void xuat() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngành: " + nganh);
        System.out.println("Điểm: " + getDiem());
        System.out.println("Học lực: " + getHocLuc());
    }
}

class SinhVienIT extends SinhVienPoly {

    private double diemJava;
    private double diemCSS;
    private double diemHTML;

    public SinhVienIT(String hoTen, String nganh, double diemJava, double diemCSS, double diemHTML) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCSS = diemCSS;
        this.diemHTML = diemHTML;
    }

    @Override
    public double getDiem() {
        return (2 * diemJava + diemCSS + diemHTML) / 4;
    }
}

class SinhVienBiz extends SinhVienPoly {

    private double diemMarketing;
    private double diemSales;

    public SinhVienBiz(String hoTen, String nganh, double diemMarketing, double diemSales) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    public double getDiem() {
        return (2 * diemMarketing + diemSales) / 3;
    }
}

/**
 *
 * @author Admin
 */
public class Lab7bai4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SinhVienPoly> danhSachSinhVien = new ArrayList<>();

        int luaChon;
        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Xuất thông tin danh sách sinh viên");
            System.out.println("3. Xuất danh sách sinh viên có học lực giỏi");
            System.out.println("4. Sắp xếp danh sách sinh viên theo điểm");
            System.out.println("5. Kết thúc");
            System.out.print("Nhập lựa chọn của bạn: ");
            luaChon = scanner.nextInt();
            scanner.nextLine(); // Clear the input buffer

            switch (luaChon) {
                case 1:
                    nhapDanhSachSinhVien(scanner, danhSachSinhVien);
                    break;
                case 2:
                    xuatDanhSachSinhVien(danhSachSinhVien);
                    break;
                case 3:
                    xuatSinhVienGioi(danhSachSinhVien);
                    break;
                case 4:
                    sapXepDanhSachSinhVien(danhSachSinhVien);
                    break;
                case 5:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (luaChon != 5);
    }

    private static void nhapDanhSachSinhVien(Scanner scanner, ArrayList<SinhVienPoly> danhSachSinhVien) {
        System.out.println("Nhập số lượng sinh viên cần thêm:");
        int soLuong = scanner.nextInt();
        scanner.nextLine(); // Clear the input buffer

        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhập thông tin sinh viên " + (i + 1) + ":");
            System.out.print("Họ tên: ");
            String hoTen = scanner.nextLine();
            System.out.print("Ngành (IT/Biz): ");
            String nganh = scanner.nextLine();
            if (nganh.equalsIgnoreCase("IT")) {
                System.out.print("Điểm Java: ");
                double diemJava = scanner.nextDouble();
                System.out.print("Điểm CSS: ");
                double diemCSS = scanner.nextDouble();
                System.out.print("Điểm HTML: ");
                double diemHTML = scanner.nextDouble();
                danhSachSinhVien.add(new SinhVienIT(hoTen, nganh, diemJava, diemCSS, diemHTML));
            } else if (nganh.equalsIgnoreCase("Biz")) {
                System.out.print("Điểm Marketing: ");
                double diemMarketing = scanner.nextDouble();
                System.out.print("Điểm Sales: ");
                double diemSales = scanner.nextDouble();
                danhSachSinhVien.add(new SinhVienBiz(hoTen, nganh, diemMarketing, diemSales));
            } else {
                System.out.println("Ngành không hợp lệ. Không thêm sinh viên.");
            }
            scanner.nextLine(); 
        }
    }

    private static void xuatDanhSachSinhVien(ArrayList<SinhVienPoly> danhSachSinhVien) {
        if (danhSachSinhVien.isEmpty()) {
            System.out.println("Danh sách sinh viên trống.");
        } else {
            System.out.println("===== DANH SÁCH SINH VIÊN =====");
            for (SinhVienPoly sv : danhSachSinhVien) {
                sv.xuat();
                System.out.println();
            }
        }
    }

    private static void xuatSinhVienGioi(ArrayList<SinhVienPoly> danhSachSinhVien) {
        boolean coSinhVienGioi = false;
        System.out.println("===== DANH SÁCH SINH VIÊN CÓ HỌC LỰC GIỎI =====");
        for (SinhVienPoly sv : danhSachSinhVien) {
            if (sv.getHocLuc().equalsIgnoreCase("Giỏi")) {
                sv.xuat();
                coSinhVienGioi = true;
                System.out.println();
            }
        }
        if (!coSinhVienGioi) {
            System.out.println("Không có sinh viên nào có học lực giỏi.");
        }
    }

    private static void sapXepDanhSachSinhVien(ArrayList<SinhVienPoly> danhSachSinhVien) {
        Collections.sort(danhSachSinhVien, new Comparator<SinhVienPoly>() {
            @Override
            public int compare(SinhVienPoly sv1, SinhVienPoly sv2) {
                // Sắp xếp sinh viên theo điểm giảm dần
                double diemSV1 = sv1.getDiem();
                double diemSV2 = sv2.getDiem();
                if (diemSV1 < diemSV2) {
                    return 1;
                } else if (diemSV1 > diemSV2) {
                    return -1;
                }
                return 0;
            }
        });

        System.out.println("Danh sách sinh viên sau khi sắp xếp:");
        for (SinhVienPoly sv : danhSachSinhVien) {
            sv.xuat();
            System.out.println();
        }
    }

}
