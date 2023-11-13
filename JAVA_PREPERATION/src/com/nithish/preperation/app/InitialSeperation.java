package com.nithish.preperation.app;
import java.util.Scanner;

public class InitialSeperation {
	String name ;
	int age;
	
	public InitialSeperation(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void intial() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String fullName=sc.nextLine();
		String[] words=fullName.split(" ");
		System.out.println("Initials from the given names are :");
		for(String word : words) {
			if(word.length()==1) {
				System.out.print(word+" ");
			}
		}
		sc.close();
		
	}
	
	@Override
	public String toString() {
		return "Name = "+name+" Age = "+age;
	}
	

}
