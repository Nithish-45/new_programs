package com.java.preperation.methods;

import java.util.Scanner;

public class AtmMachine {
	public void atm() {
		int bal=1000;
		int wd,d;
		Scanner s=new Scanner(System.in);
		System.out.println("Press 0 to continue");
		int c=s.nextInt();
		do {
			System.out.println("Enter your Choice");
			System.out.println("1:Check Balance \n2:Withdraw \n3:deposit \n4:exit");
			System.out.println("Enter your choice");
			int n =s.nextInt();
			switch(n) {
			case 1:System.out.println("Available Balance is "+bal);
			break;
			case 2:System.out.println("Enter the amount you want to withdraw");	
				wd=s.nextInt();
				if(bal>wd) {
					bal=bal-wd;
					System.out.println("Collect Your Money & Available balance is "+bal);
				}else {
					System.out.println("Insufficient Balance");
				}
				break;
			case 3:System.out.println("Enter the amount you want to deposit");	
				d=s.nextInt();
				bal=bal+d;
				System.out.println("Amount added Successfully");
				break;
			case 4:System.exit(0);
			default:System.out.println("Invalid Input");
			}System.out.println();
		}while(c!=4);
		s.close();
	}
	
	
}
