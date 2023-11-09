package com.nithish.preperation;

import com.nithish.preperation.app.Hello;

public class HelloWorld {
	int ad=0;
	public int add1() {
		ad+=1;
		return ad;
	}
	public static void main(String[] args) {
		System.out.println("Hello World");
		HelloWorld a1=new HelloWorld();
		System.out.println(a1.add1());
		System.out.println(a1.add1());

		
	}

}
