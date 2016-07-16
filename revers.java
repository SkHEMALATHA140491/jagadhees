/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revers;

/**
 *
 * @author Student
 */
public class Revers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      String string="abcdef";
      String reverse = new StringBuffer(string).
      reverse().toString();
      System.out.println("\nString before reverse:"+string);
      System.out.println("String after reverse:"+reverse);
   }
}
    
