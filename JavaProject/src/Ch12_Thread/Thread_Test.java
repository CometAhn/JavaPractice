package Ch12_Thread;

public class Thread_Test {

	public static void main(String[] args) {
		Go_Thread g = new Go_Thread();
		Come_Thread c = new Come_Thread();

		g.start();
		c.start();
	}

}
