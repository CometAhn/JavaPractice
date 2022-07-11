package Ch12_Thread;

public class _1_test {

	public static void main(String[] args) throws InterruptedException {

		_2_Go g = new _2_Go();
		_3_Come c = new _3_Come();

		g.go();
		c.come();
	}

}
