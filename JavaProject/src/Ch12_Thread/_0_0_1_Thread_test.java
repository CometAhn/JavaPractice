package Ch12_Thread;

class Key {

	public void open(String name) {
		System.out.println(name + "이(가) 화장실 문을 연다.");
	}

	public void close(String name) {
		System.out.println(name + "이(가) 화장실 문을 닫는다.");
	}

	public void defecate(String name) {
		System.out.println(name + "이(가) 볼일을 본다");
	}

	public void lookmirror(String name) {
		System.out.println(name + "이(가) 거울을 본다");

	}

	public void usetoilest(String name) {
		lookmirror(name);
		synchronized (this) {
			open(name);
			close(name);
			defecate(name);
		}

	}
}

class MyThread10 extends Thread {
	private String name;
	private Key key;

	public MyThread10(String name, Key key) {
		this.name = name;
		this.key = key;
	}

	public void run() {
		key.usetoilest(name);
	}

}

public class _0_0_1_Thread_test {

	public static void main(String[] args) {

		Key key = new Key();
		MyThread10 thread1 = new MyThread10("철수", key);
		MyThread10 thread2 = new MyThread10("영희", key);
		MyThread10 thread3 = new MyThread10("영철", key);

		thread1.start();
		thread2.start();
		thread3.start();

	}

}
