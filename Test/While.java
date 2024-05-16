/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import javax.sound.midi.SysexMessage;

/**
 *
 * @author Admin
 */
public class While {

    public static void main(String[] args) {
        int a = 7;
        int b = 1;

        while (b <= 10) {
            a = 7 * b; // Tính giá trị của bảng cửu chương 7
            b++;
        }

        System.out.println("Bảng cửu chương của 7:");
        System.out.println(a);
    }

}
