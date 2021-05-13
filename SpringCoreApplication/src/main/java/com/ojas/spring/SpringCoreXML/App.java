package com.ojas.spring.SpringCoreXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ojas.spring.SpringCoreXML.model.EmployeeConstr;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("EmpConstContext.xml");
		EmployeeConstr e = (EmployeeConstr) ac.getBean("Emp");
		//e.display();
		System.out.println(e);

	}
}
