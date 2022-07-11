package Ch12_Thread;

public class _0_GooGoo_Join implements Runnable {
	private int dan;

	public _0_GooGoo_Join(int dan) {
		this.dan = dan;
	}

	public void run() {
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "단 : " + dan + " * " + i + " = " + dan * i);
		}
	}
}