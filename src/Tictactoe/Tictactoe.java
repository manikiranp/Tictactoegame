package Tictactoe;

public class Tictactoe {
public static char[] board = new char[10];  


public static void main(String args[]) {
	System.out.println("Tictactoe Game---");
	Board();
}


private static void Board() {
	for (int i=1; i<=9; i++) {
		board[i]=' ';
	System.out.println(board[i]);
	}
	
}
	
	
}
