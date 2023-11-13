package com.java.preperation.executers;

import com.java.preperation.methods.ArmstrongNumber;
import java.util.Scanner;

public class ArmstrongNumberExecuters {
	public static void main(String[] args) {
		ArmstrongNumber ref=new ArmstrongNumber();
		System.out.println("Enter the Number");
		Scanner s =new Scanner(System.in);
		int a=s.nextInt();
		//153 is a arm strong number
		ref.armstrong(a);
		s.close();
	}

}
