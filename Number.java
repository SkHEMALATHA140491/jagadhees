/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package number;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Number {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
System.out.println("Enter array size: ");
int size = input.nextInt();
int[] crr_array = new int[size];
int[] new_array= new int[size];
int[] times = new int[size];


System.out.println("Enter array elements: ");
for (int i = 0; i < crr_array.length; i++) {
    crr_array[i] = input.nextInt();
    times[i] = 1;
}



for (int j = 0; j < crr_array.length; j++) {

    for (int i = j; i < crr_array.length; i++) {

        if (crr_array[j] == crr_array[i] && j != i) {

             new_array[i] = crr_array[i];
            times[i]++;
        }


    }

}
    }
}
