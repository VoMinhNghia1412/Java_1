/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author Admin
 */
public class lab7bai3 {
    public static void main(String[] args) {
          SinhVienIT_1 svIT = new SinhVienIT_1("Nguyen Van A", "CNTT", 8.5, 7.0, 6.5);
        SinhVienBiz_1 svBiz = new SinhVienBiz_1("Tran Thi B", "Marketing", 7.8, 8.0);

        System.out.println("Thông tin sinh viên IT:");
        svIT.xuat();

        System.out.println("\nThông tin sinh viên Biz:");
        svBiz.xuat();
    }
        
    }

