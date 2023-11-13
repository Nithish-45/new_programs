package com.java.preperation.executers;

import java.util.Scanner;

import com.java.preperation.methods.PrintStar;

public class PrintStarExecuters {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
//		PrintStar ref=new PrintStar();
		int a=s.nextInt();
		PrintStar.printstar(a);
		s.close();
	}
}
