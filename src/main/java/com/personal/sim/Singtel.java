package com.personal.sim;

import com.personal.library.Membership;

public class Singtel extends Sim {
	private Membership membership;
	
	
	public Membership getMembership() {
		return membership;
	}


	public void setMembership(Membership membership) {
		this.membership = membership;
	}


	public Singtel(String nameofsim, long datapkt, String number, String countrycode) {
		super(nameofsim, datapkt, number, countrycode);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
