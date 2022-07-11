package Ch12_Thread;

public class _2_1_Thread_Test {

	public static void main(String[] args) {
		_2_2_Go_Thread g = new _2_2_Go_Thread();
		_2_3_Come_Thread c = new _2_3_Come_Thread();

		g.start();
		c.start();
	}

}
//Thread 생성하는 방법
//
//1. java.lang.Thread 클래스를 이용하는 방법.
//	thread 클래스를 상속 받는 클래스를 작성한다.
//	public void rum() 메소드를 오버라이딩 한다.
//	main() 메소드에서 Thread 클래스를 상속하는 클래스의 객체를 생성한다.
//	해당 객체의 start() 메소드를 호출하여 스레드를 실행 시킨다.
//
//2. java.lang.Runnable 인터페이스를 이용하는 방법.
//	Runnable 인터페이스를 구성하는 클래스를 작성한다.
//	public void run() 메소드를 오버라이딩한다.
//	main() 메소드에서 Runnable 인터페이스를 궇ㄴ하는 클래스의 객체를 생성한다.
//	Thread 클래스의 객체를 생성하면서 생성자의 인자로 Runnable 인터페이스를 구현한 클래스의 객체를 전달한다.
//	Thread 객체의 start() 메소드를 호출한다.