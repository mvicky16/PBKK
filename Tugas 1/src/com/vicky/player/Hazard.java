package com.vicky.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.vicky.preferedfoot.PreferedFoot;

@Component
public class Hazard implements Player {

	private PreferedFoot preffoot;
	private String name;
	private int age;
	
	public Hazard() {
		super();
	}
	
	@Autowired
	public Hazard(@Qualifier("Right")PreferedFoot preffoot, 
			 @Value("${player1.name}")String name, 
			 @Value("${player1.age}")int age) {
		super();
		this.preffoot = preffoot;
		this.name = name;
		this.age = age;
	}

	public PreferedFoot getPreffoot() {
		return preffoot;
	}

	public void setPreffoot(PreferedFoot preffoot) {
		this.preffoot = preffoot;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String PlayerName() {
		// TODO Auto-generated method stub
		return "Hazard";
	}

}