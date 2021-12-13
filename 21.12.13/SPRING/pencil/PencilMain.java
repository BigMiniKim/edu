package com.javalec.ex.pencil;

import org.springframework.context.support.AbstractApplicationContext;

import org.springframework.context.support.GenericXmlApplicationContext;

public class PencilMain {

	public static void main(String[] args) {

		String config = "classpath:appCTX3.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(config);
		
		Pencil pencil = ctx.getBean("pencil", Pencil.class);
		pencil.use();
		ctx.close();
				
	}

}
