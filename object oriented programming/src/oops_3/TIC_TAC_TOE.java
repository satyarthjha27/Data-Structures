package oops_3;

import java.util.Scanner;

public class TIC_TAC_TOE {

	private Player player1,player2;
	private Board board;
	public static void main(String[] args) {
		TIC_TAC_TOE t=new TIC_TAC_TOE();
		t.startGame();
	}
	public void startGame() {
		//Player Input
		Scanner s=new Scanner(System.in);
		player1=takeplayerinput(1);
		player2=takeplayerinput(2);
		while(player1.getSymbol()==player2.getSymbol()) {
			System.out.println("Symbol already taken! Pick another Symbol!! ");
			char symbol=s.next().charAt(0);
			player2.setSymbol(symbol);
		}

		//create board
		board=new Board(player1.getSymbol(),player2.getSymbol());

		//conduct the game
		boolean player1turn=true;
		int status=Board.Incomplete;
		while(status == Board.Incomplete || status== Board.Invalid) {
			if(player1turn) {
				System.out.println("Player 1- "+player1.getName()+"'s Turn\nEnter x: ");
				int x=s.nextInt();
				System.out.println("Enter y ");
				int y=s.nextInt();
				status=board.move(player1.getSymbol(),x,y);
				if(status!=Board.Invalid) {
					player1turn=false;
					board.print();
				}
				else {
					System.out.println("Invalid move!! Try Again!!");
				}
			}
			else {
				System.out.println("Player 2- "+player2.getName()+"'s Turn\n Enter x: ");
				int x=s.nextInt();
				System.out.println("Enter y ");
				int y=s.nextInt();
				status=board.move(player2.getSymbol(),x,y);
				if(status!=Board.Invalid) {
					player1turn=true;
					board.print();
				}
				else {
					System.out.println("Invalid move!! Try Again!!");
				}
			}
		}
		if(status==Board.Player_1_Wins) {
			System.out.println("Player 1- "+player1.getName()+" wins!!");
		}
		else if(status==Board.Player_2_Wins) {
			System.out.println("Player 2- "+player2.getName()+" wins!!");
		}
		else
			System.out.println("Draw !!");

	}

	private Player takeplayerinput(int num) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Player "+num+" name- ");
		String name=s.nextLine();
		System.out.println("Enter Player "+num+" Symbol- ");
		char symbol=s.next().charAt(0);
		Player p=new Player(name,symbol);
		return p;
	}
}
