package com.mkyong.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// ClassPathXml debo de colocarlo en el resources
		// System debo de darle el direccion del archivo en Windos
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBeans.xml");
		
		User obj2 = (User) context.getBean("userOne");
		obj2.printUser();

		Company obj = (Company) context.getBean("CompanyOne");
		obj.printCompany();
		
	
	}
}
