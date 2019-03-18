package com.vicky.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vicky.player.*;

public class PlayerAnnotation {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("Player.xml");
		
		Player player1 = context.getBean("hazard", Player.class);
		Hazard hazard = (Hazard) player1;
		
		System.out.println("Prefered Foot : " + hazard.getPreffoot().getPreferedFoot());
		System.out.println("Player name : " + hazard.getName());
		System.out.println("Player Age : " + hazard.getAge());
		
		context.close();

	}

}