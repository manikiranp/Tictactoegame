package Tictactoe;

import java.util.Random;
import java.util.Scanner;

public class Tictactoe {
static char[] board = new char[10];
private static String compchoice;  
public static void main(String args[]) {
	System.out.println("Welcome to Tictactoe Game---");
	Board();
	Inputchoice();
	
}


private static void Inputchoice() {
	Scanner inp = new Scanner(System.in);
	System.out.println("Choose 'X' OR 'O' as input: ");
	String playchoice = inp.nextLine();
	if(playchoice.equals('X' )) {
			compchoice = "O";
	}
	else if(playchoice.equals('O')){
			compchoice = "X";
	}
	else {
		System.out.println("Wrong input");
		Inputchoice();
	}

	
	
}


private static char[] Board() {
	for (int i=1; i<board.length; i++) {
		
		board[i]=' ';
	}
	return board;
	}	
}

