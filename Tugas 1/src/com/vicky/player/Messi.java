package com.vicky.player;

import com.vicky.preferedfoot.PreferedFoot;

public class Messi implements Player {
	private PreferedFoot preffoot;
	private String name;
	private int age;
	
	public Messi() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Messi(PreferedFoot preffoot, String name, int age) {
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
		return null;
	}

}