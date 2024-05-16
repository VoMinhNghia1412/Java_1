/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

/**
 *
 * @author Admin
 */
public class lab8bai2 {
     public static final double sum(double... x) {
        double total = 0;
        for (double value : x) {
            total += value;
        }
        return total;
    }

   
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
}
