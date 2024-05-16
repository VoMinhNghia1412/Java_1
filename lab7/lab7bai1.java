/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author Admin
 */
public class lab7bai1 {
    public static void main(String[] args) {
         double dai, rong, canh;
        
        dai = 5;
        rong = 3;
        canh = 4;

        
        Chunhat cn = new Chunhat(dai, rong);
        Hinhvuong vu = new Hinhvuong(canh);

        
        System.out.println("Thông tin hình chữ nhật:");
        cn.xuat();

        System.out.println("\nThông tin hình vuông:");
        vu.xuat();
    }
        
    }

