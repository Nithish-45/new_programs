package com.java.preperation.executers;

import com.java.preperation.methods.SeriesNum;

public class SeriesNumExecuters {
	public static void main(String[] args) {
		SeriesNum ref=new SeriesNum();
		for(int i=0;i<20;i++) {
			ref.series(i);
			System.out.print(" ");
		}
	}

}
