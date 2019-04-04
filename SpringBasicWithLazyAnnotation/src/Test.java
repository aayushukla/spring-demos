package com.capgemini.spring.test;
import com.capgemini.spring.provider.MessageProvider;
import com.capgemini.spring.renderer.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Test {

	public static void main(String args[]) {
	ApplicationContext context= new ClassPathXmlApplicationContext("context.xml");
	MessageRenderer renderer= (MessageRenderer)context.getBean("renderer",MessageRenderer.class);
	renderer.render();
	System.out.println(renderer.hashCode());
	MessageRenderer renderer1= (MessageRenderer)context.getBean("renderer",MessageRenderer.class);
	System.out.println(renderer1.hashCode());
	}
}