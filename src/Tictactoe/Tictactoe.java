package Tictactoe;

import java.util.Random;
import java.util.Scanner;

public class Tictactoe {
static char[] board = new char[10];
private static String compchoice;  
public static void main(String args[]) {
	System.out.println("Welcome to Tictactoe Game---");
	Board();
//	Inputchoice();
	ShowBoard();
	
}


private static void ShowBoard() {
	System.out.println("_____________");
	System.out.println("|  "+board[1]+"|  "+board[2]+"|  "+board[3]+"|");
	System.out.println("_____________");
	System.out.println("|  "+board[4]+"|  "+board[5]+"|  "+board[6]+"|");
	System.out.println("_____________");
	System.out.println("|  "+board[7]+"|  "+board[8]+"|  "+board[9]+"|");
	System.out.println("_____________");
	
}


private static void Inputchoice() {
	Scanner UserInput = new Scanner(System.in);
	System.out.println("Choose 'X' OR 'O' as input: ");
	String playchoice = UserInput.nextLine();
	if(playchoice.equals('X')) {
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

