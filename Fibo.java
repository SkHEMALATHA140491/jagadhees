/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fibo;

/**
 *
 * @author Student
 */
public class Fibo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         int febCount = 15;
         int[] feb = new int[febCount];
         feb[0] = 0;
         feb[1] = 1;
         for(int i=2; i < febCount; i++){
             feb[i] = feb[i-1] + feb[i-2];
         }
 
         for(int i=0; i< febCount; i++){
                 System.out.print(feb[i] + " ");
         }
    }
}



