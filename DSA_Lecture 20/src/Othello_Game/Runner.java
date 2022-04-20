//Othello is a board game and you are expected to implement the move function for this game.
//Arguments passed to the function are - a symbol of the player making the move and x y coordinates of the cell 
//at which the player wishes to make the move.
//The move function will be returning a boolean, false - if the move isn't feasible and true - if the move is 
//feasible and this function will also make the move then i.e. make the required changes in the board.
//Sample Input :
//2
//2 4
//1 5
//2 5
//Sample Output :
//0 0 0 0 0 0 0 0 
//0 0 0 0 0 0 0 0 
//0 0 0 0 1 0 0 0 
//0 0 0 1 1 0 0 0 
//0 0 0 2 1 0 0 0 
//0 0 0 0 0 0 0 0 
//0 0 0 0 0 0 0 0 
//0 0 0 0 0 0 0 0 
//false
//0 0 0 0 0 0 0 0 
//0 0 0 0 0 0 0 0 
//0 0 0 0 1 2 0 0 
//0 0 0 1 2 0 0 0 
//0 0 0 2 1 0 0 0 
//0 0 0 0 0 0 0 0 
//0 0 0 0 0 0 0 0 
//0 0 0 0 0 0 0 0

package Othello_Game;

import java.util.Scanner;
public class Runner {
	static Scanner s = new Scanner(System.in);

	final static int player1Symbol = 1;
	final static int player2Symbol = 2;

	public static void main(String[] args) {
		OthelloBoard b = new OthelloBoard();
		int n = s.nextInt();
		boolean p1Turn = true;
		while(n > 0) {
			int x = s.nextInt();
			int y = s.nextInt();
			boolean ans = false;
			if(p1Turn) {
				ans = b.move(player1Symbol, x, y);
			}
			else {
				ans = b.move(player2Symbol, x, y);
			}
			if(ans) {
				b.print();
				p1Turn = !p1Turn;
				n--;
			}
			else {
				System.out.println(ans);
			}
		}
	}
}
