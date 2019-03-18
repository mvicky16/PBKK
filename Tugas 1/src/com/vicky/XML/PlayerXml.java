package com.vicky.XML;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vicky.player.*;

public class PlayerXml {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext
		context = new ClassPathXmlApplicationContext("Pemain.xml"); 
	
	Player player1 = context.getBean("hazard", Player.class);
	Hazard hazard = (Hazard) player1;
	
	System.out.println("Player name : " + hazard.getName());
	System.out.println("Player Age : " + hazard.getAge());
	
	context.close();

	}

}