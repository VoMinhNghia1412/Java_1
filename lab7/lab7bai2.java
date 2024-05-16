/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author Admin
 */
public class lab7bai2 {

    public static void main(String[] args) {

        SinhVienPoly sv1 = new SinhVienIT("Nguyen Van A", "CNTT", 7.8);
        SinhVienPoly sv2 = new SinhVienBiz("Tran Thi B", "Marketing", 6.2);

        System.out.println("Thông tin sinh viên IT:");
        sv1.xuat();
        System.out.println("\nThông tin sinh viên Biz:");
        sv2.xuat();
    }

}
