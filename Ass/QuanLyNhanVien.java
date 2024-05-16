package Ass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyNhanVien {

    private ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void nhapDanhSachNhanVien() {
        System.out.println("Nhập số lượng nhân viên cần thêm:");
        int soLuong = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhập thông tin cho nhân viên thứ " + (i + 1) + ":");
            System.out.print("Nhập mã nhân viên: ");
            String ma = scanner.nextLine();
            System.out.print("Nhập họ và tên: ");
            String hoTen = scanner.nextLine();
            System.out.print("Nhập lương: ");
            double luong = scanner.nextDouble();
            scanner.nextLine();

            danhSachNhanVien.add(new NhanVien(ma, hoTen, luong));
        }
        System.out.println("Đã nhập thông tin cho " + soLuong + " nhân viên.");
    }

    public void xuatDanhSachNhanVien() {
        if (danhSachNhanVien.isEmpty()) {
            System.out.println("Danh sách nhân viên rỗng.");
            return;
        }
        System.out.println("=== Danh sách nhân viên ===");
        for (NhanVien nv : danhSachNhanVien) {
            nv.xuatThongTin();
            System.out.println("---------------------------");
        }
    }

    public void timVaHienThiNhanVienTheoMa() {
        System.out.println("Nhập mã nhân viên cần tìm:");
        String maTim = scanner.nextLine();
        boolean found = false;
        for (NhanVien nv : danhSachNhanVien) {
            if (nv.getMa().equals(maTim)) {
                nv.xuatThongTin();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy nhân viên với mã " + maTim);
        }
    }

    public void xoaNhanVienTheoMa() {
        System.out.println("Nhập mã nhân viên cần xóa:");
        String maXoa = scanner.nextLine();
        boolean removed = false;
        for (NhanVien nv : danhSachNhanVien) {
            if (nv.getMa().equals(maXoa)) {
                danhSachNhanVien.remove(nv);
                removed = true;
                break;
            }
        }
        if (removed) {
            System.out.println("Đã xóa nhân viên có mã " + maXoa);
        } else {
            System.out.println("Không tìm thấy nhân viên có mã " + maXoa + " để xóa.");
        }
    }

    public void capNhatThongTinNhanVienTheoMa() {
        System.out.println("Nhập mã nhân viên cần cập nhật thông tin:");
        String maCapNhat = scanner.nextLine();
        boolean updated = false;
        for (NhanVien nv : danhSachNhanVien) {
            if (nv.getMa().equals(maCapNhat)) {
                System.out.println("Nhập thông tin mới cho nhân viên có mã " + maCapNhat + ":");
                System.out.print("Nhập họ và tên mới: ");
                String hoTenMoi = scanner.nextLine();
                System.out.print("Nhập lương mới: ");
                double luongMoi = scanner.nextDouble();
                scanner.nextLine();

                nv.setHoTen(hoTenMoi);
                nv.setLuong(luongMoi);
                updated = true;
                break;
            }
        }
        if (updated) {
            System.out.println("Đã cập nhật thông tin cho nhân viên có mã " + maCapNhat);
        } else {
            System.out.println("Không tìm thấy nhân viên có mã " + maCapNhat + " để cập nhật thông tin.");
        }
    }

    public void timNhanVienTheoKhoangLuong() {
        System.out.println("Nhập khoảng lương cần tìm:");
        System.out.print("Lương từ: ");
        double luongTu = scanner.nextDouble();
        System.out.print("Lương đến: ");
        double luongDen = scanner.nextDouble();
        scanner.nextLine();

        boolean found = false;
        for (NhanVien nv : danhSachNhanVien) {
            if (nv.getLuong() >= luongTu && nv.getLuong() <= luongDen) {
                nv.xuatThongTin();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có nhân viên nào trong khoảng lương từ " + luongTu + " đến " + luongDen);
        }
    }

    public void sapXepNhanVienTheoHoTen() {
        Collections.sort(danhSachNhanVien);
        System.out.println("Đã sắp xếp danh sách nhân viên theo họ tên.");
        xuatDanhSachNhanVien();
    }

    public void sapXepNhanVienTheoThuNhap() {
        Collections.sort(danhSachNhanVien, Comparator.comparingDouble(NhanVien::getThuNhap).reversed());
        System.out.println("Đã sắp xếp danh sách nhân viên theo thu nhập giảm dần.");
        xuatDanhSachNhanVien();
    }

    public void xuat5NhanVienCoThuNhapCaoNhat() {
        if (danhSachNhanVien.isEmpty()) {
            System.out.println("Danh sách nhân viên rỗng.");
            return;
        }

        System.out.println("=== 5 nhân viên có thu nhập cao nhất ===");
        ArrayList<NhanVien> temp = new ArrayList<>(danhSachNhanVien);
        temp.sort(Comparator.comparingDouble(NhanVien::getThuNhap).reversed());

        int count = 0;
        for (NhanVien nv : temp) {
            nv.xuatThongTin();
            System.out.println("---------------------------");
            count++;
            if (count == 5) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        QuanLyNhanVien quanLyNhanVien = new QuanLyNhanVien();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhập danh sách nhân viên");
            System.out.println("2. Xuất danh sách nhân viên");
            System.out.println("3. Tìm và hiển thị nhân viên theo mã");
            System.out.println("4. Xóa nhân viên theo mã");
            System.out.println("5. Cập nhật thông tin nhân viên theo mã");
            System.out.println("6. Tìm các nhân viên theo khoảng lương");
            System.out.println("7. Sắp xếp nhân viên theo họ và tên");
            System.out.println("8. Sắp xếp nhân viên theo thu nhập");
            System.out.println("9. Xuất 5 nhân viên có thu nhập cao nhất");
            System.out.println("0. Thoát chương trình");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    quanLyNhanVien.nhapDanhSachNhanVien();
                    break;
                case 2:
                    quanLyNhanVien.xuatDanhSachNhanVien();
                    break;
                case 3:
                    quanLyNhanVien.timVaHienThiNhanVienTheoMa();
                    break;
                case 4:
                    quanLyNhanVien.xoaNhanVienTheoMa();
                    break;
                case 5:
                    quanLyNhanVien.capNhatThongTinNhanVienTheoMa();
                    break;
                case 6:
                    quanLyNhanVien.timNhanVienTheoKhoangLuong();
                    break;
                case 7:
                    quanLyNhanVien.sapXepNhanVienTheoHoTen();
                    break;
                case 8:
                    quanLyNhanVien.sapXepNhanVienTheoThuNhap();
                    break;
                case 9:
                    quanLyNhanVien.xuat5NhanVienCoThuNhapCaoNhat();
                    break;
                case 0:
                    System.out.println("Đã thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 0);
        scanner.close();
    }
}
