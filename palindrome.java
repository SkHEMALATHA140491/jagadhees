/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Palindrome {

   
    public static void main(String[] args) {
      int n,an=0,a=0,t,i=0,t1;
        
        
        Scanner s2=new Scanner(System.in);
        n=s2.nextInt();
        while(n>0)
        {
            t=n%10;
            a=a*10+(t*t*t);
            n=n/10;
    }
        if(a==n)
        {
            System.out.println("palindrome");
        }
        else
                {
                    System.out.println("not palindrome");  
                }
    
}}
  
