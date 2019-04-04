package com.capgemini.spring.provider;
import org.springframework.stereotype.*;
import org.springframework.context.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;


@Component("provider")
public class GMMessageProvider implements MessageProvider {

	@Override
	public String getMessage() {
		
		return "HelloWorld";
	}

}