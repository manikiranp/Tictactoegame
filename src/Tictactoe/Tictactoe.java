package Tictactoe;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Tictactoe {
static char[] board = new char[10];
private static char compchoice;
private static char playchoice;
private static Scanner userInput;
static Set<Integer> indexset=new LinkedHashSet<Integer>();
public static void main(String args[]) {
	System.out.println("---Welcome to Tictactoe Game---");
	Tictactoe game = new Tictactoe();
	Tictactoe.Board();
	Tictactoe.Inputchoice();
	Tictactoe.ShowBoard(board);
	while(indexset.size()<=9) {
	Tictactoe.SelectLocation(board);
	Tictactoe.Selectloc_comp(board);
	}
}



private static char[] SelectLocation(char[] board) {
	System.out.println("Select the index to place: "+ playchoice); 
	int cond=1;
	while(cond==1) {
		//System.out.println("Select the index to place: "+ playchoice);
		Scanner userinput = new Scanner(System.in);
		int index = userinput.nextInt();
		if  (((index > 0 ) && (index < 10)) && (!indexset.contains(index)) ) {
		indexset.add(index);
		board[index] = playchoice;
		ShowBoard(board);
		cond=0;
	}
	else {
			System.out.println("Incorrect index number");
			System.out.println("Enter again");
	}
	}
	return board;
}

private static char[] Selectloc_comp(char[] board) {
	Random random=new Random();
	boolean match=true;
	while(match==true) {
	int index=random.nextInt(9)+1;
	
	if(indexset.contains(index))  
		match=true;
		else {
		System.out.println(index+" is comp chpoice");
		indexset.add(index);
		board[index] = compchoice;
		 ShowBoard(board);
		 match=false;
		}
		}
	
	return board;
	}
	
	





private static void ShowBoard(char[] board) {
	System.out.println("TicTacToe Board:");
	System.out.println("_____________");
	System.out.println("|  "+board[1]+"|  "+board[2]+"|  "+board[3]+"|");
	System.out.println("─────────────");
	System.out.println("|  "+board[4]+"|  "+board[5]+"|  "+board[6]+"|");
	System.out.println("─────────────");
	System.out.println("|  "+board[7]+"|  "+board[8]+"|  "+board[9]+"|");
	System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾");
	
}


private static void Inputchoice() {
	userInput = new Scanner(System.in);
	System.out.println("Choose 'X' OR 'O' as input: ");
	
	playchoice = userInput.next().toUpperCase().charAt(0);
	
	if(playchoice=='X') {
			compchoice = 'O';
	}
	else if(playchoice=='O') {
			compchoice = 'X';
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

