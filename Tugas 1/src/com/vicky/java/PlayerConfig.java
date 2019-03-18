package com.vicky.java;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.vicky.player.Player;
import com.vicky.player.Messi;
import com.vicky.preferedfoot.PreferedFoot;
import com.vicky.preferedfoot.Left;

@Configuration
@PropertySource("classpath:player.properties")
public class PlayerConfig {

	@Bean
	public PreferedFoot Left() {
		return new Left();
	}
	
	@Bean
	public Player Messi(@Value("${player2.name}")String name, 
						@Value("${player2.age}")int age){
		
		Messi messi = new Messi(Left(), name,age);
		
		return messi;
	}

}