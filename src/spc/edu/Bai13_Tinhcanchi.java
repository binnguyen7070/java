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
public class Bai13_Tinhcanchi {
    public static void main(String[] args) {
        System.out.println("Tinh Can Chi ");
        String[] Can = {"Canh" , "Tan" , "Nham" , "Quy" , "Giap" , "At" , "Binh" , "Dinh" , "Mau" , "Ky" ,};
        String [] Chi = {"Than" , "Dau" , "Tuat" , "Hoi" , "Ty" , "Suu" , "Dan", "Mao" , "Thin" , "Ty" , "Ngo" , "Mui"};
        int nam;       
        String trave;
        Scanner nhap = new Scanner(System.in);
        
        System.out.println("Nhap nam :");
        nam = nhap.nextInt();
         
        trave = Can [nam % 10 ] + " " + Chi [nam % 12];
        System.out.println("Can chi la" + trave);
        
    }
    
}
