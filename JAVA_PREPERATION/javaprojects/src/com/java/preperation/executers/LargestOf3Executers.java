package com.java.preperation.executers;

import com.java.preperation.methods.LargestOf3;
import java.util.Scanner;

public class LargestOf3Executers {
	public static void main(String[] args) {
		LargestOf3 ref=new LargestOf3();
		int a[]=new int[3];
		Scanner s =new Scanner(System.in);
		for (int i=0;i<3;i++) {
			 a[i]=s.nextInt();
		}
		ref.largestof3(a[0], a[1], a[2]);
		}

}
