package Ch12_Thread;

public class _03_1_Thread_Test {

	public static void main(String[] args) {

		Runnable rg = new _03_2_Go_Interface();
		Runnable rc = new _03_3_Come_Interface();

		Thread t1 = new Thread(rg);
		Thread t2 = new Thread(rc);

		t1.start();
		t2.start();
		// Runnable 인터페이스를 이용한 방법.
	}

}
//Thread 생성하는 방법
//
//2. java.lang.Runnable 인터페이스를 이용하는 방법.
//	Runnable 인터페이스를 구성하는 클래스를 작성한다.
//	public void run() 메소드를 오버라이딩한다.
//	main() 메소드에서 Runnable 인터페이스를 궇ㄴ하는 클래스의 객체를 생성한다.
//	Thread 클래스의 객체를 생성하면서 생성자의 인자로 Runnable 인터페이스를 구현한 클래스의 객체를 전달한다.
//	Thread 객체의 start() 메소드를 호출한다.
