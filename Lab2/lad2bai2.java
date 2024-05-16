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
public class lad2bai2 {

    public static void main(String[] args) {
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
}
