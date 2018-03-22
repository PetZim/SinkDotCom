package com.wint.simpledotcom;

import java.util.ArrayList;
import java.util.Arrays;

public class SimpleDotComGame {
	public static void main (String[] args) {
		int numOfGuesses = 0;
		GameHelper helper = new GameHelper();
		DotCom dotCom = new DotCom();
		
		int randomNum = (int) (Math.random() * 5);

		ArrayList<Integer> dotComLocations = new ArrayList<>();
		dotComLocations.add(randomNum++);
		dotComLocations.add(randomNum++);
		dotComLocations.add(randomNum);
		
		boolean isAlive = true;
		
		while(isAlive) {
			String guess = helper.getUserInput("enter a number");
			String result = dotCom.checkYourself(guess);
			numOfGuesses++;
			if (result.equals("kill")) {
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " guesses.");
			}
		}		
	}
}
