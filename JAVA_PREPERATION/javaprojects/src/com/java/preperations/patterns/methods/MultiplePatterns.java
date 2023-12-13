package com.java.preperations.patterns.methods;

public class MultiplePatterns {
	//square
	public void pattern1(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}			
	}
	
	//1st quad triangle
	public void pattern2(int n){
		int rows = n;
		for (int i = 1; i <= rows; i++) {
		    for (int j = 1; j <= i; j++) {
		        System.out.print("* ");
		    }
		    System.out.println();
		}

	}
	//4th quad triangle

	public void pattern3(int n) {
		int rows = n;
		for (int i = rows; i >= 1; i--) {
		    for (int j = 1; j <= i; j++) {
		        System.out.print("* ");
		    }
		    System.out.println();
		}
	}
	
	//2nd quad triangle

	public void pattern4(int n) {
		int rows = n;
		for (int i = 0; i<rows; i++) {
		    for (int j=0; j<rows; j++) {
		    	if(j>=rows-i-1) {
		    		System.out.print("*");
		        }
		    	else
		    	{
		    		System.out.print(" ");
		    	}
		    }
		    System.out.println();
		}
	}
	
	//3rd quad triangle

	public void pattern5() {
		int rows=5;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<rows;j++) {
				if(i>=j) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}

			}
			System.out.println();
		}
		
	}
	
	//top half triangle
	public void pattern6(int n) {
		int rows = n;
		for (int i = 1; i <= rows; i++) {
		    for (int j = rows; j > i; j--) {
		        System.out.print(" ");
		    }
		    for (int k = 1; k <= i * 2 - 1; k++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
	
	//bottom half triangle
	public void pattern7(int n){
		int rows = n;
		int space = 0;
		for (int i = rows; i >= 1; i--) {
		    for (int j = 1; j <= space; j++) {
		        System.out.print(" ");
		    }
		    space++;
		    for (int k = 1; k <= 2 * i - 1; k++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		}
	
	//right half
	public void pattern8(int n) {
		 int rows = n;

	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }

	        for (int i = rows - 1; i >= 1; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    }
	
	
	//left half
	public void pattern9() {
		int n=5;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n;j++) {
				if(j>=n-i-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}		
			}
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
					   
					if(j>=i) 
					
					{
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
					
				}
				System.out.println();
			
			
		}
	}
	
	
	//
	public void pattern10() {
		for(int i=0;i<=5;i++) {
			char a='A';
			for(int j=0;j<=5;j++) {
				if (j>=5-i+1) {
//				if(i>=j) {
					System.out.print(a+" ");
					a++;
				}
				else {
					System.out.print(" ");
				}
				
			}	
			System.out.println();
	}		
	}
	
	public void pattern11() { //48
		int n=5;
		int x=1;
		int a,b;
		for(int i=n;i>=1;i--) {
			a=i;
			b=x;
			for(int j=n;j>=i;j--) {
				System.out.print(" "+b);
				b=b-a;
				a++;
			}
			x=x+i;
			System.out.println();
			
			
		}
		
	}
	
	public void pattern12() {
		int n=5;
		int x=1;
		int y=n;
		int c1,c2,r1,r2;
		for(int i=n;i>=1;i--) {
			c1=x;
			c2=y;
			r1=i;
			r2=i+1;
			for(int j=n;j>=i;j--) {
				if((i+j)%2==0) {
					System.out.print(" "+c1);
				}
				else {
					System.out.print(" "+c2);
				}
//				System.out.println(c1+" "+c2);
				c1-=r1++;
				c2-=r2++;
			}
			y+=i-1;
			x+=i;
			System.out.println();
		}
		
	}
	
	
	//diamond pattern
	public void pattern13() {
		int rows = 5;
		for (int i = 1; i <= rows; i++) {
		    for (int j = rows; j > i; j--) {
		        System.out.print(" ");
		    }
		    for (int k = 1; k <= i * 2 - 1; k++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		for (int i = rows - 1; i >= 1; i--) {
		    for (int j = rows - 1; j >= i; j--) {
		        System.out.print(" ");
		    }
		    for (int k = 1; k <= i * 2 - 1; k++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
	
	
	//
	public void pattern14() {
		int n=5;
		for(int i=n;i>0;i--) {
			for(int j=1;j<=n;j++) {
				if(i<=j) {
					System.out.print(j);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	
	public void pattern15() {
		int n=5;
		int n1=0;
		int n2=1;
		int n3=n1+n2;
		for(int i=0;i<n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(n3);
				n3=n1+n2;
				n1=n2;n2=n3;
				
			}
			System.out.println();
		}
	}

}
