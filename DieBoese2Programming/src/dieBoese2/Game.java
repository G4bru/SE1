package dieBoese2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {
//Ich mag Kekse
	public static void main(String[] args) {
	 Game game = new Game();
	}
	protected static String readInput() {
		String input;
		
		try(var in = new BufferedReader(new InputStreamReader(System.in))) {
			input = in.readLine();
		// ACHTUNG k�nnte Endlosschleife werden
		} catch (IOException e) {
			System.out.println("Eingabe ist falsch!");
			return readInput();  
		}		
			return input;
			
	}

}
