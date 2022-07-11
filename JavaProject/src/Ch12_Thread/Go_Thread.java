package Ch12_Thread;

public class Go_Thread extends Thread {

	public void run() {
		while (true) {
			System.out.println("go");
		}
	}
}
