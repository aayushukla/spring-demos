package com.capgemini.spring.model;
import java.util.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.PropertySource;



@Service
@PropertySource("database.properties")
public class Organization {
	@Value("100")
	private int organizationId;
	
	@Value("Capgemini")
	private String organizationName;
	
	@Value("50000")
	private double marketPrice;

	//@Autowired
	private Address address;

	@Value("#{'${server.name}'.split(',')}")
	private List<String> directors;

	@Value("{'${setBranches}'}")
	private Set<String> branches;

	@Value("#{${valuesMap}}")
	private Map<String,String> branchWiseHead;

	@Value("${ipAddr}")
	private Properties ipAddresses;

	@Value("${dbName},username${user},${password}")
	private Properties databaseDetails;
	
	@Override
	public String toString() {
		return "Organization [organizationId=" + organizationId + ", organizationName=" + organizationName
				+ ", marketPrice=" + marketPrice + ", address=" + address + ", directors=" + directors + ", branches="
				+ branches + ", branchWiseHead=" + branchWiseHead + ", ipAddresses=" + ipAddresses
				+ ", databaseDetails=" + databaseDetails + "]";
	}
	
}