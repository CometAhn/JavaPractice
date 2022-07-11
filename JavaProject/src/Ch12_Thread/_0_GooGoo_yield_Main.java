package Ch12_Thread;

public class _0_GooGoo_yield_Main {

	public static void main(String[] args) {

		Thread t2 = new Thread(new _0_GooGoo_yield(2));
		Thread t3 = new Thread(new _0_GooGoo_yield(3));
		Thread t4 = new Thread(new _0_GooGoo_yield(4));
		Thread t5 = new Thread(new _0_GooGoo_yield(5));
		Thread t6 = new Thread(new _0_GooGoo_yield(6));
		Thread t7 = new Thread(new _0_GooGoo_yield(7));
		Thread t8 = new Thread(new _0_GooGoo_yield(8));
		Thread t9 = new Thread(new _0_GooGoo_yield(9));

		t2.setPriority(4);
		t3.setPriority(4);
		t4.setPriority(4);
		t5.setPriority(4);
		t6.setPriority(4);
		t7.setPriority(6);
		t8.setPriority(5);
		t9.setPriority(5);

		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();

		System.out.print("main() 종료 .....");

	}

}
