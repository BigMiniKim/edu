package edu.kosmo.ex;

public class RPSGame {

	private int rps;

	public RPSGame(String rps) {

		if (rps.equals("scissors"))
			this.rps = 1;
		else if (rps.equals("rock"))
			this.rps = 2;
		else
			this.rps = 3;
	}

	private String getRPSString(int rps) {
		String str = null;

		if (rps == 1)
			str = "scissors";
		else if (rps == 2)
			str = "rock";
		else
			str = "paper";
		return str;
	}

	public RPSGame() {
		this.rps = (int) (Math.random() * 3 + 1); 
	}

	public int result(RPSGame player) {
		int r = 0;

		if (this.rps == player.rps) {

			return r = 1;
		}
		// 1.가위 2.바위 3.보
		if (this.rps == 1 && player.rps == 2) {
			return r = 2;
		} else if (this.rps == 1 && player.rps == 3) {
			return r = 3;
		} else if (this.rps == 2 && player.rps == 1) {
			return r = 3;
		} else if (this.rps == 2 && player.rps == 3) {
			return r = 2;
		} else if (this.rps == 3 && player.rps == 1) {
			return r = 2;
		} else if (this.rps == 3 && player.rps == 2) {
			return r = 3;
		}
		return r;

	}
		
}
