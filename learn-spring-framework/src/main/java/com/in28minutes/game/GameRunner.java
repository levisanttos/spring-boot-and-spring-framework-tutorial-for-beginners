package com.in28minutes.game;

public class GameRunner {
	
	GamingConsole gamingConsole;
	
	public GameRunner(GamingConsole  gamingConsole) {
		this.gamingConsole = gamingConsole;
	}

	public void run() {
		System.out.println("Running game: " + gamingConsole);
		gamingConsole.down();
		gamingConsole.up();
		gamingConsole.left();
		gamingConsole.rigth();
	}

}
