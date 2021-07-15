package oops_3;

public class Player {

	private String name;
	private char symbol;
	
	public Player(String name, char symbol) {
		if(!name.isEmpty()) {
			setName(name);
			setSymbol(symbol);
		}
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}
	 public char getSymbol() {
		return symbol;
	}
}
