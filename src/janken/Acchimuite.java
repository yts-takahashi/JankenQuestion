package janken;

public class Acchimuite {

	public static int hoi(Player winner) {
		System.out.println("あっちむいて...");
		Player user = new User();
		Direction userDirection = user.point();
		Player cpu = new CPU();
		Direction cpuDirection = cpu.point();
		System.out.println("ほいっ！");
		System.out.println(String.format("", userDirection, cpuDirection)); // TODO: フォーマットを実装
		if (!userDirection.equals(cpuDirection)) {
			return 0;
		}
		if ( /* TODO: 実装 */ ) {
			return 1;
		}else {
			return -1;
		}
	}

}
