package Ch06_Class_Review;

class runtest {

	void startsum() {
		_01_1_range r = new _01_1_range();

		r.sum();
	}
}

public class _01_0_main {

	public static void main(String[] args) {

		runtest t1 = new runtest();
		runtest t2 = new runtest();

		t1.startsum();
		t2.startsum();

	}

}
