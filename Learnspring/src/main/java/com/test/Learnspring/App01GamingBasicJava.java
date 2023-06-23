package com.test.Learnspring;

import com.test.Learnspring.game.GameRunner;
import com.test.Learnspring.game.MarioGame;
import com.test.Learnspring.game.PacMan;
import com.test.Learnspring.game.SuperContra;


public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		var game = new MarioGame();
		
/*		var game = new SuperContra();  */
		
		var game = new PacMan();
		
		var gameRunner = new GameRunner(game);
		
		
		
		gameRunner.run();
		
		
		SuperContra contra = new SuperContra();
		gameRunner = new GameRunner(contra);
		
		gameRunner.run();
		
		 
//		marioGame.up();
//		marioGame.down();
//		marioGame.left();
//		marioGame.right();
		
		
		
		
		
	}

}
