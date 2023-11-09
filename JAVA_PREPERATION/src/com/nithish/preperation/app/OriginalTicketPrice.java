package com.nithish.preperation.app;

public class OriginalTicketPrice {
	public double originalprice(double pay,double discount) {
		double ActualPrice=0;
		ActualPrice=pay/(1-(discount/100f));
		
		return ActualPrice;
	}

}
