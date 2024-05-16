/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

/**
 *
 * @author Admin
 */
public class lab8bai4 {

    public static void main(String[] args) {
        double[] numbers = {3.5, 7.2, 2.8, 9.1, 5.6};
        double total = lab8bai3.sum(numbers);
        System.out.println("Tổng các số là: " + total);

        // Tìm số nhỏ nhất
        double min = lab8bai3.min(numbers);
        System.out.println("Số nhỏ nhất là: " + min);

        // Tìm số lớn nhất
        double max = lab8bai3.max(numbers);
        System.out.println("Số lớn nhất là: " + max);

        String text = "nguyen van teo";
        String upperCaseText = lab8bai3.toUpperFirstChar(text);
        System.out.println("Chuỗi sau khi chuyển đổi: " + upperCaseText);
    }

}
