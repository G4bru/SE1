package dieBoese2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HumanPlayer extends Player {
 
	public HumanPlayer(char figure){
		super(figure);
 }
	public String getMyMove()
	{ String coordinate;
	var in = new BufferedReader(new InputStreamReader(System.in));
	try {
		coordinate = in.readLine();
	// ACHTUNG k�nnte Endlosschleife werden
	} catch (IOException e) {
		return getMyMove();  

	}
		return coordinate;
		}
	}