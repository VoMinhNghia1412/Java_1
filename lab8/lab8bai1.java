/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

/**
 *
 * @author Admin
 */
public class lab8bai1 {

    public static final double sum(double... x) {
        double total = 0;
        for (double value : x) {
            total += value;
        }
        return total;
    }

    public static void main(String[] args) {

        double total = sum(1.5, 2.3, 4.7, 3.1);
        System.out.println("Tổng các số là: " + total);
    }
}
