/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thi_Ps23109;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        int count = 0;
        for (int num : arr) {
            if (num % 3 != 0) {
                sum += num;
                count++;
            }
        }
        double average = (double) sum / count;
        System.out.println("Các phần tử không chia hết cho 3 là: " + average);
    }
}
