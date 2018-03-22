package com.wint.simpledotcom;

import java.util.ArrayList;

public class DotCom {
	ArrayList<Integer> locationCells = new ArrayList<>();
	
	public String checkYourself(String guess) {
		int guessLoc = Integer.parseInt(guess);
		String result = "miss";
		for (int location : locationCells) {
			if (location == guessLoc) {
				result = "hit";
				locationCells.remove(new Integer(location));
				break;
			}
		}
		
		result = locationCells.isEmpty() ? "kill" : result;
		System.out.println(result);
		return result;
	}
	
	public void setLocationCells(ArrayList<Integer> loc) {
		this.locationCells = loc;
	}
}
