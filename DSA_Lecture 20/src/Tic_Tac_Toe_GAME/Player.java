package Tic_Tac_Toe_GAME;
//here we are keeping the data of the player

public class Player {
	
	private String name;
	private char symbol;
	
	public Player(String name , char symbol) {
		 setName(name);
		 setSymbol(symbol);
	}
      // setting the name of the player using getter setter function
	public void setName(String name) {
		if(! name.isEmpty()) {
			this.name = name;
		}
	}
	public String getName() {
		return name;
	}
	
	//setting the name of the symbol using getter setter function
	public void setSymbol(char symbol) {
		if(symbol != '\0') { // checking that the symbol is not null
			this.symbol = symbol;
		}
	}
	public char getSymbol() {
		return symbol;
	}
}
