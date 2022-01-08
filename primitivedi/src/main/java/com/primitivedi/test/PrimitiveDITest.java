package com.primitivedi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.primitivedi.bean.Bike;

public class PrimitiveDITest {

	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory
				(new ClassPathResource("com/primitivedi/common/application-context.xml"));
		
		Bike bike = beanFactory.getBean("Bike",Bike.class);
		System.out.println(bike);

	}

}
