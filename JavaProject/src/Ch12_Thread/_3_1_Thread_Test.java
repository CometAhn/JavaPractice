package Ch12_Thread;

public class _3_1_Thread_Test {

	public static void main(String[] args) {

		Runnable rg = new _3_2_Go_Interface();
		Runnable rc = new _3_3_Come_Interface();

		Thread t1 = new Thread(rg);
		Thread t2 = new Thread(rc);

		t1.start();
		t2.start();

	}

}
