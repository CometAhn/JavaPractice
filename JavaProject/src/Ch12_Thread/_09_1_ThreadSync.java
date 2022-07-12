package Ch12_Thread;

class add extends Thread {
	private source sc;
	int id;

	public add(int i, source sc) {
		this.sc = sc;
		this.id = i;
	}

	public void run() {
		for (int i = 0; i < 3; i++) {
			sc.add(id, 50);
		}
	}
}

class source {
	private int sum = 0;

	public synchronized void add(int id, int a) {
		int tmp = sum;
		System.out.println("[" + id + "] 현재 값은 " + tmp + "입니다.");

		tmp += a;
		System.out.println("[" + id + "] 현재 값은 " + tmp + "입니다.");

		sum = tmp;
	}
}

public class _09_1_ThreadSync {

	public static void main(String[] args) {

		source sr = new source();
		add ad1 = new add(1, sr);
		add ad2 = new add(2, sr);

		ad1.start();
		ad2.start();

	}

}
