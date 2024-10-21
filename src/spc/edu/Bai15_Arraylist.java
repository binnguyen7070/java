/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.util.ArrayList;


/**
 *
 * @author SPC
 */
public class Bai15_Arraylist {
    public static void main(String[] args) {
        System.out.println("Bin");
       
        ArrayList a = new ArrayList();
        for(int i = 1; i <101; i++)
        {
            a.add(i);
        }
        a.add("Bin");
        a.remove(99);
        System.out.println("Mang a = " + a);
        System.out.println("Size mang = " + a.size());
        
        
        
    }
    
}
