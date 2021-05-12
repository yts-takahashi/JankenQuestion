package janken;

public class Main {
	static int REQUIRED_NUMBER_OF_WINS = 3;

	public static void main(String[] args) {
		int numberOfWins = 0;
		while(Math.abs(numberOfWins) < REQUIRED_NUMBER_OF_WINS) {
			Player winner = Janken.pon();
			numberOfWins += Acchimuite.hoi(winner);
		}
	}
}
