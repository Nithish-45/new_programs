package com.java.preperation.executers;

import java.util.Scanner;


import com.java.preperation.methods.ReplaceString;

public class ReplaceStringExecuters {
	public static void main(String[] args) {
		   ReplaceString rep=new ReplaceString();
		   
		   Scanner sc=new Scanner(System.in);
		   
		   System.out.println("enter the string");
		   String a=sc.nextLine();
		   
		   System.out.println("enter the replaced string");
		   String b=sc.nextLine();
		   
		   System.out.println("enter the replacing string");
		   String c=sc.next();
		  
			rep.replace(a,b,c);
			
			sc.close();
					 
		}

}
