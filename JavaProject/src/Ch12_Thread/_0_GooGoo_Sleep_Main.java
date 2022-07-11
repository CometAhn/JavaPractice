package Ch12_Thread;

public class _0_GooGoo_Sleep_Main {

	public static void main(String[] args) {

		Thread t2 = new Thread(new _0_GooGoo_Sleep(2));
		Thread t3 = new Thread(new _0_GooGoo_Sleep(3));
		Thread t4 = new Thread(new _0_GooGoo_Sleep(4));
		Thread t5 = new Thread(new _0_GooGoo_Sleep(5));
		Thread t6 = new Thread(new _0_GooGoo_Sleep(6));
		Thread t7 = new Thread(new _0_GooGoo_Sleep(7));
		Thread t8 = new Thread(new _0_GooGoo_Sleep(8));
		Thread t9 = new Thread(new _0_GooGoo_Sleep(9));

		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();

		System.out.println("main() 종료 .....");
	}

}
