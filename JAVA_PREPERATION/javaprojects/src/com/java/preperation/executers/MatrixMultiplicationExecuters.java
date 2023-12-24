package com.java.preperation.executers;

import com.java.preperation.methods.MatrixMultiplication;

public class MatrixMultiplicationExecuters {
	public static void main(String[] args) {
		MatrixMultiplication ref=new MatrixMultiplication();
		int a[][]= {{1,1,1},
			    {2,2,2},
			    {3,3,3}};
		int b[][]= {{1,1,1},
			    {2,2,2},
			    {3,3,3}};
		ref.matmulti(a,b);
	}

}
