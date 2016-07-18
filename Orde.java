/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package orde;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Orde {

    /**
     * @param args the command line arguments
     */
   public static String main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("enter the value=\n");
        
        str=sc.nextLine();
     if (str.length() <= 1) return str;
  
  String mid = str.substring(1, str.length()-1);
  System.out.println(" the value are =\n" +String mid);
  
  return str.charAt(str.length()-1) + mid + str.charAt(0);
       
    }
}


