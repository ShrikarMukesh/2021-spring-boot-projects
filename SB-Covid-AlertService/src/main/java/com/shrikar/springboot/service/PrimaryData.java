package com.shrikar.springboot.service;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PrimaryData {

	private String number;

	@JsonProperty("number-tollfree")
	private String numberTollfree;

	private String email;

	private String twitter;
	private String facebook;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getNumberTollfree() {
		return numberTollfree;
	}
	public void setNumberTollfree(String numberTollfree) {
		this.numberTollfree = numberTollfree;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTwitter() {
		return twitter;
	}
	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
}
