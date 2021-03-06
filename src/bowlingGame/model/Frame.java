package bowlingGame.model;

public class Frame {
	private static final int MAX_TRIES = 2;
	private int[] scores;
	private int pins;
	private int tries;
	//private boolean strike;

	public Frame() {
		this.scores = new int[MAX_TRIES];
		this.pins = 10;
	}

	public boolean isStrike() {
		return pins == 0 && tries == MAX_TRIES - 1;
	}

	public boolean isSpare() {
		return pins == 0 && tries == MAX_TRIES;
	}

	public boolean isFinished() {
		return isStrike() || tries == MAX_TRIES;
	}

	public int getFirstTryScore() {
		return scores[0];
	}

	public int getSecondTryScore() {
		return scores[1];
	}

	public void setScore(int score) {
		scores[tries++] = score;
		pins -= score;
	}
	
	public int getScore() {
		return scores[0] + scores[1];
	}
}
