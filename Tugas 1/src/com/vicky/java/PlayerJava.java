package com.vicky.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vicky.player.Player;
import com.vicky.player.Messi;

public class PlayerJava {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(PlayerConfig.class);
		
		Player player = context.getBean("messi", Player.class);
		Messi messi = (Messi)player;
		
		System.out.println("Prefered Foot: " + messi.getPreffoot().getPreferedFoot());
		System.out.println("Player Name: " + messi.PlayerName());
		
		context.close();

	}

}