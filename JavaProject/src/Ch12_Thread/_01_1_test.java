package Ch12_Thread;

public class _01_1_test {

	public static void main(String[] args) {

		_01_2_Go g = new _01_2_Go();
		_01_3_Come c = new _01_3_Come();

		g.go();
		c.come();

		// go 만 반복
	}

}
