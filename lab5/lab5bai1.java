
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class lab5bai1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> danhSachSoThuc = new ArrayList<>();

       
        System.out.println("Nhập danh sách số thực (Nhập 'N' để kết thúc):");
        while (true) {
            System.out.print("Nhập số thực: ");
            double soThuc = scanner.nextDouble();
            danhSachSoThuc.add(soThuc);
            System.out.print("Nhập thêm (Y/N)? ");
            scanner.nextLine(); 
            String tiepTuc = scanner.nextLine();
            if (tiepTuc.equalsIgnoreCase("N")) {
                break;
            }
        }

       
        System.out.println("Danh sách số thực vừa nhập:");
        for (double soThuc : danhSachSoThuc) {
            System.out.println(soThuc);
        }

       
        double tong = 0;
        for (double soThuc : danhSachSoThuc) {
            tong += soThuc;
        }
        System.out.println("Tổng của danh sách số thực: " + tong);
    }
}
