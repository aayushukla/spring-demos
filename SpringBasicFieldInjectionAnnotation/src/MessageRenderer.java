package com.capgemini.spring.renderer;
import com.capgemini.spring.provider.MessageProvider;
import com.capgemini.spring.provider.GMMessageProvider;
import org.springframework.context.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service("renderer")
public class MessageRenderer {
	

	@Autowired
	private MessageProvider renderer;
	
	
	
	public void render() {
		System.out.println(renderer.getMessage());
	}
}
	

		