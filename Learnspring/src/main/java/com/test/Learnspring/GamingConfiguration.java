package com.test.Learnspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.test.Learnspring.game.GameRunner;
import com.test.Learnspring.game.GamingConsole;
import com.test.Learnspring.game.PacMan;


@Configuration
public class GamingConfiguration {
	
	
	@Bean
	public GamingConsole game() {	
		var game = new PacMan();	
		return game;
	}
	
	
	@Bean
	public GameRunner gameRunner() {
		var gameRunner = new GameRunner(game());
		return gameRunner;
	}
	
//	@Bean
//	public GameRunner gameRunner(GamingConsole game) {
//		var gameRunner = new GameRunner(game);
//		return gameRunner;
//	}
	


}
