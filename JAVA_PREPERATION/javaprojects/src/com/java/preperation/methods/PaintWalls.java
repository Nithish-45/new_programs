package com.java.preperation.methods;

import java.util.Scanner;
public class PaintWalls {

	
   public void painting(int a,int b) {
    	System.out.println("welcome");
		Scanner s=new Scanner(System.in);
        double totalinte=0;
		System.out.println("enter the interior walls");
    	for(int i=0;i<a;i++) {
    		double inte=s.nextDouble();
    		totalinte+=18*inte	;
    	}
    	double totalexte=0;
		System.out.println("enter the exterior walls");
    	for(int i=0;i<b;i++) {

    		double exte=s.nextDouble();
    		totalexte+=12*exte;
    	}
    	
    	double total=totalinte+totalexte;
    	System.out.println("Total estimated cost ="+total+".INR");
    }
}
