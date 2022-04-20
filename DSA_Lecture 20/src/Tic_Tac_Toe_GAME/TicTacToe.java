package Tic_Tac_Toe_GAME;

import java.util.Scanner;

public class TicTacToe {
	
	private Player player1 , player2;
	private Board board;
	
	public void startGame () {
		Scanner s = new Scanner(System.in);
		 //Player input
		player1 = takePlayerInput(1);
		player2 = takePlayerInput(2);
		
		//if both player pick the same symbol then we should tell the player2 to choose another symbol
		//until the player2 chooses another symbol we will continue asking to choose another symbol
		while(player1.getSymbol() == player2.getSymbol()) {
			System.out.println("Symbol Already taken !! Pick another symbol !!");
			char symbol = s.next().charAt(0);//taking input of another symbol
			player2.setSymbol(symbol); // calling the setter function to set the symbol
		}
		
		//Create Board
		board = new Board(player1.getSymbol() , player2.getSymbol());
		
		
		//Conduct the Game
		boolean player1Turn = true; // it will tell which player turn it is .If it is false then its player2 turn
		int status = Board.INCOMPLETE;
		
		while(status == Board.INCOMPLETE || status == Board.INVALID) {
			if(player1Turn) {
				System.out.println("Player 1 - " + player1.getName() + "'s turn");
				//we will take coordinate on which player want to make its move
				System.out.println("Enter x:");
				int x = s.nextInt();
				System.out.println("Enter y:");
				int y = s.nextInt();
				
				 status = board.move(player1.getSymbol() , x , y); //this function will basically tells can move or not
			    if(status != Board.INVALID) {
			    	player1Turn = false;
			    	board.print(); //printing the Board so that player get to know that which box is filled
			    }
			    else {
			    	System.out.println("invalid Move !! Try Again !!");
			    }
			}
			else {
				System.out.println("Player 2 - " + player2.getName() + "'s turn");
				//we will take coordinate on which player want to make its move
				System.out.println("Enter x:");
				int x = s.nextInt();
				System.out.println("Enter y:");
				int y = s.nextInt();
				
				 status = board.move(player2.getSymbol() , x , y); //this function will basically tells can move or not
			    if(status != Board.INVALID) {
			    	player1Turn = true;
			    	board.print();
			    }
			    else {
			    	System.out.println("invalid Move !! Try Again !!");
			    }
			}
		}
		if(status == Board.PLAYER_1_WINS) {
			System.out.println("Player 1 - " + player1.getName() +" wins !!");
		}
		else if(status == Board.PLAYER_2_WINS) {
			System.out.println("Player 2 - " + player2.getName() +" wins !!");
		}
		else {
			System.out.println("Draw !!");
		}
	}

	//taking input of player from the user
	private Player takePlayerInput(int num) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Player " + num + " name: ");
		String name = s.nextLine();
		System.out.println("Enter Player " + num + " symbol: ");
		char symbol = s.next().charAt(0);
		
		//creating an object of the Player class and passing the data
		Player p = new Player(name, symbol);
		return p;
	}
	
	//main function 
	public static void main(String[] args) {
		TicTacToe t = new TicTacToe();
		t.startGame();
	}
}
