package Ch12_Thread;

public class _0_GooGoo_Sleep implements Runnable {

	private int dan;

	public _0_GooGoo_Sleep(int dan) {
		this.dan = dan;
	}

	public void run() {
		long sleepTime = (long) (Math.random() * 500);
		System.out.println(dan + "단이" + sleepTime + "만큼 sleep...");
		try {
			Thread.sleep(sleepTime);
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "단 : " + dan + " * " + i + "=" + dan * i);
		}
	}

}
