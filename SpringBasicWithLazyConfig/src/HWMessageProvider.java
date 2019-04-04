package com.capgemini.spring.provider;

public class HWMessageProvider implements MessageProvider {

	@Override
	public String getMessage() {
		
		return "HelloWorld";
	}

}