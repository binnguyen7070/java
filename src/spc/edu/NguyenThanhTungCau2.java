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
public class NguyenThanhTungCau2 {
    public static void main(String[] args) {
          System.out.println("TinhChuViDienTich");
        Scanner nhap = new Scanner(System.in);
        
        double a,b,c,S,A ;
        
        System.out.print(" Nhap cach a: ");
        a = nhap.nextDouble();
        
        System.out.print(" Nhap cach b: ");
        b = nhap.nextDouble();
        
        System.out.print(" Nhap cach c: ");
        c = nhap.nextDouble();
        
        S = (a + b +c)/ 2 ;
        
        System.out.println("Nua Chu Vi = " + S);
        
        a = Math.sqrt(S*(S-a)*(S-b)*(S-c));
        System.out.println("Dien Tich = " + a);
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
