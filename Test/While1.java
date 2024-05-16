/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

/**
 *
 * @author Admin
 */
public class While1 {

    public static void main(String[] args) {
        int tong = 0;
        int dem = 0;
        int min = 27;
        int max = 250;
        int i = min;

        while (i <= max) { 
            if (i % 3 == 0) {
                tong += i; 
                dem++;
            }
            i++;
        }

        System.out.println("Tổng các số chia hết cho 3 từ " + min + " đến " + max + " là " + tong);
        System.out.println("Số lượng các số chia hết cho 3 từ " + min + " đến " + max + " là " + dem);
    }

}
