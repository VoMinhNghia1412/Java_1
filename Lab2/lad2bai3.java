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
public class lad2bai3 {

    public static void main(String[] args) {
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
