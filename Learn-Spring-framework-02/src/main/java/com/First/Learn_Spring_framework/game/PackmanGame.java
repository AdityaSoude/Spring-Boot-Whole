package com.First.Learn_Spring_framework.game;

import org.springframework.stereotype.Component;

@Component
public class PackmanGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Go up");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Go down");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("Go left");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Go right");
	}

}
