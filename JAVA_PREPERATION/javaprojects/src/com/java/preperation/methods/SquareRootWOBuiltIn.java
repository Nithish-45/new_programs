package com.java.preperation.methods;

public class SquareRootWOBuiltIn {
	public double squareRoot(double d)   
	{  
	//temporary variable  
	double t;  
	double sqrtroot=d/2;  
	do   
	{  
	t=sqrtroot;  
	sqrtroot=(t+(d/t))/2;  
	}   
	while((t-sqrtroot)!= 0);  
	return sqrtroot;  
	} 
}