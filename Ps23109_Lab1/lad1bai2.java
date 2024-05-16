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
public class lad1bai2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập chiều dài hcn: ");
        double dai = scanner.nextDouble();
        System.out.print("Hãy nhập chiều rộng hcn: ");
        double rong = scanner.nextDouble();

        double chuvi = (dai + rong) * 2;
        double dientich = dai * rong;
        double canhnhonhat = Math.min(dai, rong);

        System.out.println("Chu vi hcn là : " + chuvi);
        System.out.println("Dien tích hcn là : " + dientich);
        System.out.println("Cạnh nhỏ nhất hcn là : " + canhnhonhat);

    }
}
