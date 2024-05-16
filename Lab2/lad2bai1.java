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
public class lad2bai1 {

    public static void main(String[] args) {
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

}
