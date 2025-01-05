package hk.exam.ten;

public class Player {

	private String name = "";// 이름
	private boolean passCheck = false;

	Player() {

	}

	Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean getPassCheck() {
		return passCheck;
	}
	public void setPassCheck() {
		this.passCheck=!this.passCheck;
	}

}
