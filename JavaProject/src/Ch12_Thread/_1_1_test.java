package Ch12_Thread;

public class _1_1_test {

	public static void main(String[] args) throws InterruptedException {

		_1_2_Go g = new _1_2_Go();
		_1_3_Come c = new _1_3_Come();

		g.go();
		c.come();

		// go 만 반복
	}

}
