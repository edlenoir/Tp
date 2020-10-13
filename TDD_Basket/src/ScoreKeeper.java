
public class ScoreKeeper {
	private int TeamA;
	private int TeamB;
	
	public String getScore() {
		return String.format("%03d", TeamA) +":" + String.format("%03d", TeamB);
	}

	public void scoreTeamA1() {
		TeamA++;
	}

	public void scoreTeamA2() {
		TeamA=TeamA + 2;
	}
	
	public void scoreTeamA3() {
		TeamA=TeamA + 3;
	}

	public void scoreTeamB1() {
		TeamB++;
	}
	
	public void scoreTeamB2() {
		TeamB=TeamB + 2;
	}
	
	public void scoreTeamB3() {
		TeamB=TeamB + 3;
	}
	
}
