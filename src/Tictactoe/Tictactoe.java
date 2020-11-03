package Tictactoe;

public class Tictactoe {
static char[] board = new char[10];  
public static void main(String args[]) {
	System.out.println("Tictactoe Game---");
	Board();
}


private static char[] Board() {
	for (int i=1; i<board.length; i++) {
		
		board[i]=' ';
	}
	return board;
		
	
	}	
}
