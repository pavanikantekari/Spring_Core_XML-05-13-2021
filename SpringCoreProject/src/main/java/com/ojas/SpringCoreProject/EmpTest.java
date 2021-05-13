package com.ojas.SpringCoreProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ojas.SpringCoreProject.model.Employee;

public class EmpTest {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("empContext.xml");
		Employee e = (Employee)ac.getBean("empObj");
		System.out.println(e);
	}

}
