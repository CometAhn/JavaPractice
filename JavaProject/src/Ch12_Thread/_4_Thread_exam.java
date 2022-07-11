package Ch12_Thread;

class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("스레드 진행중 " + i);
		}
	}
}

class MyThread2 implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("러너블 진행중 " + i);
		}
	}
}

public class _4_Thread_exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread th1 = new MyThread();
		Runnable th2 = new MyThread2();

		Thread t = new Thread(th2);
		th1.start();
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("메인 함수 진행중" + i);
		}
	}

}
