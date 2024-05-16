/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import java.util.Scanner;

/**
 *
 * @author AdminScanner scanner = new Scanner(System.in);Scanner scanner = new
 * Scanner(System.in);Scanner scanner = new Scanner(System.in);Scanner scanner =
 * new Scanner(System.in);Scanner scanner = new Scanner(System.in);Scanner
 * scanner = new Scanner(System.in);Scanner scanner = new
 * Scanner(System.in);Scanner scanner = new Scanner(System.in);
 */
public class trycatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int a = scanner.nextInt();
            System.out.println("Ban da nhap dung");
        } catch (Exception e) {
            System.out.println("Vui long nhap lai");
        }
    }

}
