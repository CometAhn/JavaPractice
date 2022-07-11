
package Ch12_Thread;

class SleepThread extends Thread {
	public void run() {
		System.out.println("카운트다운 5초");
		for (int i = 5; i >= 0; i--) {
			System.out.println(i);
			if (i != 0) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException ie) {
					System.out.println(ie.toString());
				}
			}
		}
		System.out.println("종료");
	}
}

public class _6_Sleep_Thread {

	public static void main(String[] args) {
		SleepThread t = new SleepThread();

		t.start();
	}

}
