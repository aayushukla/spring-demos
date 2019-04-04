package com.capgemini.spring.config;
import com.capgemini.spring.renderer.MessageRenderer;
import com.capgemini.spring.provider.GMMessageProvider;
import com.capgemini.spring.provider.MessageProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;


@Configuration
public class AppConfiguration {
 	@Bean
 	public MessageProvider provider() {
 	return new GMMessageProvider();
 	}
	@Bean
 	public MessageRenderer renderer(){
 	MessageRenderer obj= new MessageRenderer();
	obj.setMessageRenderer(provider());
	return obj;
 	}
}