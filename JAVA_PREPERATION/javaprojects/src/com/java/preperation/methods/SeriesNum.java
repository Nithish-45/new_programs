package com.java.preperation.methods;

public class SeriesNum {
	 public void series(int pos) {
	    	int v,v1;
	    	if(pos%2==0) {
	    		v=pos-2;
	    		v1=v/2;
	    		System.out.println(v1);
	    	}
	    	else {
	    		v1=pos-1;
	    		System.out.println(v1);
	    	}
	    }
}
