package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		/*Calculator calculator = new Calculator();
		
		MyCalculator myCalculator = new MyCalculator();

		myCalculator.setCalculator(new Calculator());
		
		myCalculator.setFirstNum(10);
		myCalculator.setSecondNum(2);
		
		myCalculator.add();*/
		
		String config = "classpath:appCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(config);
		MyCalculator myCalculator = ctx.getBean("myCalculator", MyCalculator.class);
		myCalculator.add();
		
	}

}
