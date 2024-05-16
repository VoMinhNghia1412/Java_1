/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class lab6bai1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ và tên: ");
        String fullName = scanner.nextLine();

        int firstSpaceIndex = fullName.indexOf(" ");
        int lastSpaceIndex = fullName.lastIndexOf(" ");

        String ho = fullName.substring(0, firstSpaceIndex).toUpperCase();
        String ten = fullName.substring(lastSpaceIndex + 1).toUpperCase();
        String tenDem = fullName.substring(firstSpaceIndex + 1, lastSpaceIndex);

        System.out.println("Họ: " + ho);
        System.out.println("Tên: " + ten);
        System.out.println("Tên đệm: " + tenDem);
    }

}
