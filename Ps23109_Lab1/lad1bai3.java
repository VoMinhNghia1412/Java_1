/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ps23109_Lab1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class lad1bai3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập độ dài cạnh của khối lập phương: ");
        double dodaicanh = scanner.nextDouble();
        double thetich = dodaicanh * dodaicanh * dodaicanh;
        System.out.println("Thể tích của khối lập phương: " + thetich);
    }

}
