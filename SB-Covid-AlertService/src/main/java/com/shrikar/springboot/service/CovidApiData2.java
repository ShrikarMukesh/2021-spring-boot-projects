package com.shrikar.springboot.service;

import java.time.ZonedDateTime;


public class CovidApiData2 {
	
	private ContactData data;

	private ZonedDateTime lastRefreshed;

	private ZonedDateTime lastOriginUpdate;


	public ContactData getData() {
		return data;
	}

	public void setData(ContactData data) {
		this.data = data;
	}

	public ZonedDateTime getLastRefreshed() {
		return lastRefreshed;
	}

	public void setLastRefreshed(ZonedDateTime lastRefreshed) {
		this.lastRefreshed = lastRefreshed;
	}

	public ZonedDateTime getLastOriginUpdate() {
		return lastOriginUpdate;
	}

	public void setLastOriginUpdate(ZonedDateTime lastOriginUpdate) {
		this.lastOriginUpdate = lastOriginUpdate;
	}
}
