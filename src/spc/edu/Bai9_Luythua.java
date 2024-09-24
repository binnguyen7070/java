/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.Scanner;
/**
 *
 * @author SPC
 */
public class Bai9_Luythua {
    public static void main(String[] args) {
        System.out.println("Tinh luy thua");
        Scanner nhap = new Scanner(System.in);
        
        double so, mu,Luythua = 1;
        
        System.out.print("Nhap so: ");
        so = nhap.nextDouble();
        System.out.print("Nhap mu: ");
        mu = nhap.nextDouble();
        
        for (int i = 0; i <mu; i++){
            Luythua *= so;
            
        }
        System.out.println("Luy thua cua"+ so + " = " + Luythua);
    }
}
