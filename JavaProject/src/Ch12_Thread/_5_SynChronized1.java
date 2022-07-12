package Ch12_Thread;

class MyThreadB implements Runnable {
	Ticketing ticket = new Ticketing();

	@Override
	public void run() {
		ticket.ticketing();
	}
}

class Ticketing {
	int ticketNumber = 1;

	public synchronized void ticketing() { // public synchronized void 공동의 메서드에 대해서
		if (ticketNumber > 0) {// 한 스레드가 먼저 작업을 하고 있을 때 다른 스레드의 접근을 막는 것.
			System.out.println(Thread.currentThread().getName() + "가 티켓팅 성공");
			ticketNumber--;
		} else {
			System.out.println(Thread.currentThread().getName() + "가 티켓팅 실패");
		}
		System.out.println(Thread.currentThread().getName() + "가 티켓팅 시도 후 티켓수 : " + ticketNumber);
	}
}

public class _5_SynChronized1 {

	public static void main(String[] args) {
		MyThreadB s1 = new MyThreadB();

		Thread t1 = new Thread(s1, "A");
		Thread t2 = new Thread(s1, "B");
		Thread t3 = new Thread(s1, "C");

		t1.start();
		t2.start();
		t3.start();
	}

}
