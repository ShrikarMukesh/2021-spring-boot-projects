package com.shrikar.springboot;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class HelloController {

	@RequestMapping(value = "/hello",method = RequestMethod.GET,produces = MediaType.APPLICATION_XML_VALUE)
	@ResponseBody
	public Hello sendMessage() {
		Hello h = new Hello();
		h.setMessage("Good Evening!!!");h.setName("Shrikar");
		return h;
	}
	
	@RequestMapping(value = "/next",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Hello helloFortune() {
		Hello h = new Hello();
		h.setMessage("Response is JSON!!!");h.setName("JSON Data");
		return h;
	}
}
