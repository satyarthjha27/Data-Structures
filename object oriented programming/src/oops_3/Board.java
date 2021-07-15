package oops_3;

public class Board {

	private char[][] board;
	private char p1symbol,p2symbol;
	private int count=0;
	private int boardsize=3;
	
	public final static int Player_1_Wins=1;
	public final static int Player_2_Wins=2;
	public final static int Draw=3;
	public final static int Incomplete=4;
	public final static int Invalid=5;
	
	public Board(char p1symbol,char p2symbol) {
		board=new char[boardsize][boardsize];
		for(int i=0;i<boardsize;i++) {
			for(int j=0;j<boardsize;j++) {
				board[i][j]=' ';
			}
		}
		this.p1symbol=p1symbol;
		this.p2symbol=p2symbol;
	}

	public int move(char symbol, int x, int y) {
		if(x < 0 || x >= boardsize || y < 0 || y >=boardsize || board[x][y] !=' ') {
			return Invalid;
		}
		board[x][y]=symbol;
		count++;
		//First row  
		if(board[x][0]==board[x][1] && board[x][0]==board[x][2]) {
			return symbol==p1symbol?Player_1_Wins:Player_2_Wins;
		}
		//Second row
		if(board[0][y]==board[1][y] && board[0][y]==board[2][y]) {
			return symbol==p1symbol?Player_1_Wins:Player_2_Wins;
		}
		//First Diagonal
		if(board[0][0]!=' ' && board[0][0]==board[1][1] && board[0][0]==board[2][2]) {
			return symbol==p1symbol?Player_1_Wins:Player_2_Wins;
		}
		//Second Diagonal
		if(board[0][2]!=' ' && board[0][2]==board[1][1] && board[0][2]==board[2][0]) {
			return symbol==p2symbol?Player_2_Wins:Player_1_Wins;
		}
		if(count==boardsize*boardsize) {
			return Draw;
		}
		return Incomplete;
		
	}

	public void print() {
		System.out.println("--------------------");
		for(int i=0;i<boardsize;i++) {
			for(int j=0;j<boardsize;j++) {
				System.out.print("| "+board[i][j]+" |");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("--------------------");
	}
}
