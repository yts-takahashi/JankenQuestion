package janken;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Janken {
	static final List<Hand> HANDS = new ArrayList<Hand>(
			Arrays.asList(
				new Hand(0),
				new Hand(1),
				new Hand(2)
			)
		);

	public static Player pon() {
		Player user = new User();
		Player cpu = new CPU();
		Player winner = battle(user, cpu, "じゃんけん...");
		return winner;
	}

	private static Player battle(Player user, Player cpu, String shout) {
		System.out.println(shout);
		Hand userHand = user.showHand();
		System.out.println("あなたの手は" + userHand);
		Hand cpuHand = cpu.showHand();
		System.out.println("CPUの手は" + cpuHand);

		// TODO: 実装
	}
}
