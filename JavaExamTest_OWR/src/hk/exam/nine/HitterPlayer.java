package hk.exam.nine;

public class HitterPlayer extends Human {
	
	private boolean isWinner;

	public HitterPlayer() {
		// TODO Auto-generated constructor stub
	}
	public HitterPlayer(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public void setWinner (boolean isWinner) {
		this.isWinner=isWinner;
	}
	
	public boolean isWinner() {
		return isWinner;
	}
	
	public String toString() {
		return name;
	}

}
