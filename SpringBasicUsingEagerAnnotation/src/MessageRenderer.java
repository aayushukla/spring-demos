package com.capgemini.spring.renderer;
import com.capgemini.spring.provider.MessageProvider;
import com.capgemini.spring.provider.GMMessageProvider;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service("renderer")
public class MessageRenderer {
	
	private MessageProvider renderer;
	
	
	@Autowired
	public MessageRenderer(MessageProvider renderer) {
		this.renderer=renderer;
	}

	public void render() {
		System.out.println(renderer.getMessage());
	}
	
}
	

		