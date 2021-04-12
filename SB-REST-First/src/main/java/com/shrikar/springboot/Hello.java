package com.shrikar.springboot;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Hello {
	
	String name;
	String message;
	
	public Hello(){

	}
	
	public Hello(String name, String message) {
		super();
		this.name = name;
		this.message = message;
	}

	@Override
	public String toString() {
		return "Hello [name=" + name + ", message=" + message + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
