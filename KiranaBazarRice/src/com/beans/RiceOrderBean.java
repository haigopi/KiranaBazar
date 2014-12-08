package com.beans;

public class RiceOrderBean {
	private String name;
	private String email;
	private String mobileNumber;
	private String alternateNumber;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zip;
	private String country;
	private String basmati;
	private String sn1;
	private String sn2;
	private String rice;

	public String getMessage() {
		return "Order Ship to : " +getAddress1() + ", " + getAddress2() + ", " +  getCity()
				+ ", " +  getState() + ", " +  getZip() + ", " +  getCountry() + ".  <br> Order Details : " +  getRice();
	}

	public String getRice() {
		return rice;
	}

	public void setRice(String rice) {
		this.rice = rice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAlternateNumber() {
		return alternateNumber;
	}

	public void setAlternateNumber(String alternateNumber) {
		this.alternateNumber = alternateNumber;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getBasmati() {
		return basmati;
	}

	public void setBasmati(String basmati) {
		this.basmati = basmati;
	}

	public String getSn1() {
		return sn1;
	}

	public void setSn1(String sn1) {
		this.sn1 = sn1;
	}

	public String getSn2() {
		return sn2;
	}

	public void setSn2(String sn2) {
		this.sn2 = sn2;
	}

}
