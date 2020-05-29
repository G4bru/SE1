package dieBoese2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 
 * @author Floris Wittner
 * @version V 0.2.0
 * @date 29.05
 *
 */
public class HumanPlayer extends Player {
 private String myMove;
	public HumanPlayer(char figure){
		super(figure);
 }
	public static void main(String[] args) {
		HumanPlayer p1 = new HumanPlayer('X');
		System.out.println(p1.getMyMove());
	}
	
	/**
	 * 
	 * @return myMove
	 */
	public String getMyMove(){   
		return myMove;
		}
	@Override
	protected void blockSpace(Board board) {
		System.out.println("Welches Feld wollen Sie blockieren?");
		myMove = Game.readInput();
		 if(board.isValidMove(myMove)) {
			 board.placeFigure(myMove, 'B');
		 } else {
			System.out.println("Dieses Feld kann nicht blockiert werden.");
			blockSpace(board);
		 }
		 }
	@Override
	protected void makeMove(Board board) {
		System.out.println("Auf welches Feld wollen Sie einen Stein legen?");
		myMove = Game.readInput();
		 if(board.isValidMove(myMove)) {
			 board.placeFigure(myMove, figure);
		 } else {
			 System.out.println("Sie k�nnen kein Stein auf dieses Feld legen.");
			 makeMove(board);
		 }
	}
	}