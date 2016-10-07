/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lowerarray;

/**
 *
 * @author KSRIET
 */
import java.util.*;
import java.lang.*;
import java.io.*;

public class Lowerarray {


	public static void main (String[] args) 
	{
	String str1="javss";
	String str2="aavj";
	System.out.println("both are "+anagram(str1,str2));
	}
	public static boolean anagram(String str1,String str2)
	{
	    char[] c1=str1.toCharArray();
	    char[] c2=str2.toCharArray();
	    Arrays.sort(c1);
	    Arrays.sort(c2);
	    return Arrays.equals(c1,c2);
	}
}
    
    

