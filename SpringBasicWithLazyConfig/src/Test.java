package com.capgemini.spring.test;
import com.capgemini.spring.provider.MessageProvider;
import com.capgemini.spring.renderer.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.capgemini.spring.config.AppConfiguration;

class Test {

	public static void main(String args[]) {
	ApplicationContext context= new AnnotationConfigApplicationContext(AppConfiguration.class);
	MessageRenderer renderer= (MessageRenderer)context.getBean("renderer",MessageRenderer.class);
	renderer.render();
	}
}