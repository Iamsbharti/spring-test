package com.emp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource res= new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		Employee e =(Employee)factory.getBean("employeeBean");
		e.displayName();
	}

}
