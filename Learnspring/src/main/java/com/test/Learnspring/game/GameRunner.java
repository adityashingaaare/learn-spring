package com.test.Learnspring.game;

import org.springframework.context.annotation.Configuration;

@Configuration
public class GameRunner {
	
	private GamingConsole game;

	public GameRunner(GamingConsole game) {
		// TODO Auto-generated constructor stub
		this.game = game;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Game is Running : " +game);
		
		game.up();
		game.down();
		game.left();
		game.right();
		
	}
		
	

}
