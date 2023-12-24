package com.java.preperation.methods;

public class MatrixMultiplication {
	public void matmulti(int a [][],int b [][]) {
		if(a.length==b.length) {
			int c[][]=new int[a.length][b.length];
			int rows=3;int col=3;
			for(int i=0;i<rows;i++) {
				for(int j=0;j<col;j++) {
					for(int k=0;k<rows;k++) {
						c[i][j]+=a[i][k]*b[k][j];
					}
					System.out.println(c[i][j]);
				}
			}
			System.out.println();
		}
	}
}
