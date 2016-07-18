/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package po;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Po {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter  the no:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0)
        {
            System.out.println("The given number is even");
        }
        else
        {
            System.out.println("The given number is odd");
        }
        }
            
}