/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jee;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Jee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("enter the values:");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int temp=0;
        int n,c,d=0;
        while(a>0){
         n=a%10;
         temp+=n;
         a=a/10;
        }
        System.out.println("the total is:"+temp);
       int t=temp;
    while(temp>0){
      c=temp%10;
      d=d*10+c;
      temp=temp/10;
      
    }
        System.out.println("the reverse value is:"+d);
    
if(d==t){
    System.out.println("the total is palindrome");
}
else{
    System.out.println("the total is not palindrome");
}}}

