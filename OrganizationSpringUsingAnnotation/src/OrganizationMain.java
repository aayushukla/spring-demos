package com.capgemini.spring.client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.capgemini.spring.model.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.context.support.GenericXmlApplicationContext;

public class OrganizationMain{

	public static void main(String args[]){
		
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
 		context.load("context.xml");
 		context.refresh();
		Organization org=(Organization)context.getBean("organization");
		System.out.println(org);
	}
}