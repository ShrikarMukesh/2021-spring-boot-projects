package com.shrikar.springboot.service;

public class Contacts {
	
	private PrimaryData primary;

	public PrimaryData getPrimary() {
		return primary;
	}

	public void setPrimary(PrimaryData primary) {
		this.primary = primary;
	}

	private StateData2[] regional;

	public StateData2[] getRegional() {
		return regional;
	}

	public void setRegional(StateData2[] regional) {
		this.regional = regional;
	}
}
