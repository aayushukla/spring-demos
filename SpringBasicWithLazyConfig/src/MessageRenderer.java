package com.capgemini.spring.renderer;
import com.capgemini.spring.provider.MessageProvider;
import com.capgemini.spring.provider.GMMessageProvider;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Lazy
@Service("renderer")
public class MessageRenderer {
	
	private MessageProvider renderer;
	private MessageProvider renderer1;
	@Autowired
	public MessageRenderer(MessageProvider renderer) {
		this.renderer=renderer;
	}
	@Autowired
	public void setMessageRenderer1(MessageProvider renderer1) {
		this.renderer1=renderer1;
	}

	public void render() {
		System.out.println(renderer.getMessage());
		System.out.println(renderer.hashCode());
		System.out.println(renderer1.hashCode());
	
	}
}
	

		