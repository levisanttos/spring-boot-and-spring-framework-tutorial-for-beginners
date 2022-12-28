/**
 * 
 */
package com.in28minutes;

import com.in28minutes.game.GameRunner;
import com.in28minutes.game.MarioGame;
import com.in28minutes.game.SuperContraGame;

/**
 * @author santt
 *
 */
public class AppGamingBasicJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();
		System.out.println("Super Contra");
		var superContra = new SuperContraGame();
		var gameRunnerSuperContra = new GameRunner(superContra);
		gameRunnerSuperContra.run();
	}

}
