package com.javalec.ex.bmi;

import org.springframework.context.support.AbstractApplicationContext;

import org.springframework.context.support.GenericXmlApplicationContext;

public class BmiMain {

	public static void main(String[] args) {

		String config = "classpath:appCTX2.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(config);
		MyInfo myInfo = ctx.getBean("myInfo",MyInfo.class);
		myInfo.getInfo();
		
		ctx.close();

	}

}
