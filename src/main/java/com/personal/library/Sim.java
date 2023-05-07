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
	protected String getNameofsim() {
		return nameofsim;
	}
	protected void setNameofsim(String nameofsim) {
		this.nameofsim = nameofsim;
	}
	protected long getDatapkt() {
		return datapkt;
	}
	protected void setDatapkt(long datapkt) {
		this.datapkt = datapkt;
	}
	protected String getNumber() {
		return number;
	}
	protected void setNumber(String number) {
		this.number = number;
	}
	protected String getCountrycode() {
		return countrycode;
	}
	protected void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
	

}
