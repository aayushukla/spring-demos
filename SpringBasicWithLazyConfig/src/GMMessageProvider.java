package com.capgemini.spring.provider;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

@Lazy
@Component("provider")
public class GMMessageProvider implements MessageProvider {

	@Override
	public String getMessage() {
		
		return "HelloWorld";
	}

}