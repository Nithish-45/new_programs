package com.java.preperation.methods;
import java.util.Scanner;
public class candies {
	  public candies() {
			System.out.println("welcome");
			int n=10;
			Scanner s=new Scanner(System.in);
			int a=s.nextInt();
			if (a>n) {
				System.out.println("INVALID INPUT");
			}
			else {
				System.out.println("number of candies = "+a);
				if(n-a<n/2) {
					System.out.println("remaining number of candies = 10 ");
				}
				else {
					System.out.println("remaining number of candies = "+(n-a));
				}
			}		
		}

}
