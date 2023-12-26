package com.java.preperations.vechicle.driver;


public class abstractionExdrive {
	public class day extends p2{
		public void hello() {
			System.out.println("child2 is running ");
		}
		public static void main(String [] args) {
//			day p=new day();
			p2 d=new p2();
			day d2=new day();
			d2.hello();
		}
		
	}

}
