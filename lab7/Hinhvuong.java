/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author Admin
 */
public class Hinhvuong extends Chunhat{
     public Hinhvuong(double canh) {
        super(canh, canh);
    }

    @Override
    public void xuat() {
        System.out.println("Cạnh: " + dai);
        System.out.println("Diện tích: " + getDienTich());
        System.out.println("Chu vi: " + getChuVi());
    }
}


