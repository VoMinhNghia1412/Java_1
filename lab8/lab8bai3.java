/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

/**
 *
 * @author Admin
 */
public class lab8bai3 {

    public static final double sum(double... x) {
        double total = 0;
        for (double value : x) {
            total += value;
        }
        return total;
    }

    // Phương thức tìm số nhỏ nhất
    public static final double min(double... x) {
        if (x.length == 0) {
            throw new IllegalArgumentException("Không có tham số nào được truyền vào.");
        }
        double min = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] < min) {
                min = x[i];
            }
        }
        return min;
    }

    // Phương thức tìm số lớn nhất
    public static final double max(double... x) {
        if (x.length == 0) {
            throw new IllegalArgumentException("Không có tham số nào được truyền vào.");
        }
        double max = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] > max) {
                max = x[i];
            }
        }
        return max;
    }

   
    public static final String toUpperFirstChar(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            char firstChar = Character.toUpperCase(word.charAt(0));
            String upperFirstChar = firstChar + word.substring(1);
            result.append(upperFirstChar).append(" ");
        }

        return result.toString().trim();
    }

}
