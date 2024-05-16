/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class lad2bai4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Giải phương trình bậc 1");
        System.out.println("Giải phương trình bậc 2");
        System.out.println("Tính tiền điện ");
        System.out.println("Exit");
        

        System.out.println("Hãy chọn trương trình");
        int chon = scanner.nextInt();

        switch (chon) {
            case 1:
                giaiPhuongtrinhbac1();
                break;

            case 2:
                giaiPhuongtrinhbac2();
                break;

            case 3:
                tinhTiendien();
                break;
            case 4:
                System.out.println("Thoát khỏi chương trình");
                System.exit(0);
                break;
            default:
                throw new AssertionError();
        }

    }

    public static void giaiPhuongtrinhbac1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay hap he so a:");
        int a = scanner.nextInt();
        System.out.print("Hay nhap he so b:");
        int b = scanner.nextInt();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem ");

            }
        } else {
            double x = -b / a;
            System.out.println("Nghiem cua phuong trinh la: " + x);
        }

    }

    public static void giaiPhuongtrinhbac2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hệ số a");
        double a = scanner.nextDouble();
        System.out.println("Nhập hệ số b");
        double b = scanner.nextDouble();
        System.out.println("Nhập hệ số c");
        double c = scanner.nextDouble();

        if (a == 0) {
            if (b == 0 && c == 0) {
                System.out.println("Phương trình có vô số nghệm");

            } else if (b == 0) {
                System.out.println("Phương trình vô nghiệm");

            } else {
                double x = -c / b;
                System.out.println("Nghiệm của phương trình là x = " + x);

            }

        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Nghiệm kép của phương trình là x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm phân biệt:");
                System.out.println("Nghiệm 1: x1 = " + x1);
                System.out.println("Nghiệm 2: x2 = " + x2);
            }
        }
    }

    public static void tinhTiendien() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số điện ");
        double sodien = scanner.nextDouble();

        if (sodien < 0) {
            System.out.println("Vui lòng nhập số dương");
        } else {
            if (sodien <= 50) {
                double tien = sodien * 1000;
                System.out.println("Tiền điện của bạn là:" + tien);

            } else {
                double tien = 50 * 1000 + (sodien - 50) * 1200;
                System.out.println("Tiền điện của bạn là:" + tien);
            }
        }
    }

}
