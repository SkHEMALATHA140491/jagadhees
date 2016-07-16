/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prim;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class pos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("Enter the no:");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a>0){
            System.out.println("the no: is positive");
        }
            else if(a<0){
                System.out.println("the no: is negative");
            }
            else{
                System.out.println("the no:is zero");
                }
        }
    }

