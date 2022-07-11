package Ch12_Thread;

public class test {

	public static void main(String[] args) throws InterruptedException {

		Go g = new Go();
		Come c = new Come();

		g.go();
		c.come();
	}

}
