package Ch12_Thread;

class Mythread8 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("t1 : " + i);
		}
		System.out.println("<<<t1 완료>>>");
	}

}

class Mythread9 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("t2 : " + i);
		}
		System.out.println("<<<t2 완료>>>");
	}

}

public class _08_Join {

	public static void main(String[] args) {

		Mythread8 s1 = new Mythread8();
		Mythread9 s2 = new Mythread9();
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);

		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			System.out.println(e.toString());
		}
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			System.out.println(e.toString());
		}

		for (int i = 0; i < 10; i++) {

			System.out.println("메인스레드 : " + i);
		}
	}

}
