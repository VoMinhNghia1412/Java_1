/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import java.util.Scanner;


/**
 *
 * @author Admin
 */
public class DoWhile {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int so=-1;
        
        do {
            System.out.println("Nhập vào một số nguyên dương: ");
            so = scanner.nextInt();
            if (so < 0) {
                System.out.println("Số bạn nhập không hợp lệ. Vui lòng nhập lại.");
            }
        } while (so < 0);

        System.out.println("Bạn đã nhập số nguyên dương: " + so);
        
        scanner.close();
    }
    
       
}

