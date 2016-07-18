/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dup;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Dup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          String s;
        // TODO code application logic here
        Scanner ss=new Scanner(System.in);
        s=ss.nextLine();
        char[] c=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
            if(c[i]==c[j])
            {
               c[j]=0; 
            }
        }
    }
        for(int i=0;i<s.length();i++)
        { if(c[i]!=0)
        {
            System.out.print("The Resulet is:"+c[i]);
            }
        }
        
    
}
}
