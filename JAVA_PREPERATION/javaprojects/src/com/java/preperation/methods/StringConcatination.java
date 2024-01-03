package com.java.preperation.methods;

public class StringConcatination {
	public String concat(String a,String b,String c ) {
    	String concated;
    	String a1="";
    	String b1="";
    	String c1="";
    	for(int i=0;i<a.length();i++) {
//    		if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u') {
//    			a1+='%';
// 
//    		}
//    		else {
    			a1+=a.charAt(i);
//    		}
    	}
    	for(int i=0;i<b.length();i++) {
//    		if(b.charAt(i)=='a' || b.charAt(i)=='e' || b.charAt(i)=='i' || b.charAt(i)=='o' || b.charAt(i)=='u') {
//    			b1+='#';
//    		}
//    		else {
    			b1+=b.charAt(i);
//    		}
    	}
    	c1=c.toUpperCase();
    	concated=a1+b1+c1;
    	return concated;
    	
    }
}
