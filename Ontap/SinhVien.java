/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ontap;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SinhVien {

    String hotensv;
    String masv;
    double diemJava;
    double diemHTML;

    public String getHotensv() {
        return hotensv;
    }

    public void setHotensv(String hotensv) {
        this.hotensv = hotensv;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemHTML() {
        return diemHTML;
    }

    public void setDiemHTML(double diemHTML) {
        this.diemHTML = diemHTML;
    }

    public SinhVien() {
    }

    public SinhVien(String hotensv, String masv, double diemJava, double diemHTML) {
        this.hotensv = hotensv;
        this.masv = masv;
        this.diemJava = diemJava;
        this.diemHTML = diemHTML;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien");
        hotensv = scanner.nextLine();
        System.out.println("Nhap ma sinh vien ");
        masv = scanner.nextLine();
        System.out.println("Nhap diem java ");
        diemJava = scanner.nextDouble();
        System.out.println("Nhap diem HTML");
        diemHTML = scanner.nextDouble();
    }

    public void xuat() {
        System.out.println("Ten sinh vien"+ hotensv);
        System.out.println("Ma sinh vien"+masv);
        System.out.println("Diem mon Java"+diemJava);
        System.out.println("Diem mon HTML"+diemHTML);
    }
    
    public double getDiemTB(){
    return 
            }
}
