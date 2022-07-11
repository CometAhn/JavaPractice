package Ch12_Thread;

public class _0_GooGoo_yield implements Runnable {
	private int dan;

	public _0_GooGoo_yield(int dan) {
		this.dan = dan;
	}

	@Override
	public void run() {
		if (dan == 8) {
			System.out.println("8단이 yield...");
			Thread.yield();
		}

		for (int i = 0; i <= 9; i++) {
			System.out.println(dan + "단 : " + dan + "*" + i + "=" + dan * i);
		}
	}

}
