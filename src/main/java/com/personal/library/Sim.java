package com.personal.library;

public abstract class Sim {
	private String nameofsim;
	private long datapkt;
	private String number;
	private String countrycode;
	public Sim(String nameofsim, long datapkt, String number, String countrycode) {
		super();
		this.nameofsim = nameofsim;
		this.datapkt = datapkt;
		this.number = number;
		this.countrycode = countrycode;
	}
	public String getNameofsim() {
		return nameofsim;
	}
	public void setNameofsim(String nameofsim) {
		this.nameofsim = nameofsim;
	}
	public long getDatapkt() {
		return datapkt;
	}
	public void setDatapkt(long datapkt) {
		this.datapkt = datapkt;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
	

}
