package Ch12_Thread;

public class _2_1_Thread_Test {

	public static void main(String[] args) {
		_2_2_Go_Thread g = new _2_2_Go_Thread();
		_2_3_Come_Thread c = new _2_3_Come_Thread();

		g.start();
		c.start();

		// thead메소드를 이용한 방법.
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