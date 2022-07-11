package Ch12_Thread;

public class Come_Thread extends Thread {
	public void run() {
		while (true) {
			System.out.println("come");
		}
	}

}
