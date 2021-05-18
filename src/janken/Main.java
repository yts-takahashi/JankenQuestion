package janken;

public class Main {
	static int REQUIRED_NUMBER_OF_WINS = 3;

	public static void main(String[] args) {
		int numberOfWins = 0;
		while(Math.abs(numberOfWins) < REQUIRED_NUMBER_OF_WINS) {
			Player winner = Janken.pon();
			int result = Acchimuite.hoi(winner);
			numberOfWins += result;
			displayResult(result, numberOfWins);
		}
	}

	private static void displayResult(int result, int numberOfWins) {
		if (result == 0) {
			return;
		}

		if (result == 1 ) {
			System.out.println("あなたの勝ちです。");
		}else {
			System.out.println("あなたの負けです。");
		}

		if (result != 0) {
			if (numberOfWins == 0) {
				System.out.println("勝ち負けが同じです。");
				return;
			}

			System.out.print(String.format("現在%d回", Math.abs(numberOfWins)));
			if (numberOfWins > 0) {
				System.out.println("勝ち越しています。");
			}else {
				System.out.println("負け越しています。");
			}
		}
	}
}
