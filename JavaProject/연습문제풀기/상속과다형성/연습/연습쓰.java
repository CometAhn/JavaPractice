/*문제2.  문제 1에서 작성한 MyTv2 클래스에 이전 채널(previous channel)로 이동하는 기능의 메서드를 추가해서 실행결과와 같은 결과를 얻도록 하시오.
[hint] 이전 채널의 값을 저장할 멤버변수를 정의하라.

메서드명 : gotoPrevChannel
기능 : 현재 채널을 이전 채널로 변경한다.
반환타입 : 없음
매개변수 : 없음

class MyTv2 {
  boolean isPowerOn;
  int channel;
  int volume;

  final int MAX_VOLUME = 100;
  final int MIN_VOLUME = 0;
  final int MAX_CHANNEL = 100;
  final int MIN_CHANNEL = 1;


  /
     (1) 알맞은 코드를 넣어 완성하시오.
     set을 이용해 어디에 넣고
     get을 이용해 가져오고(반환받고)

     (문제1)의 MyTv2클래스에 gotoPrevChannel 메서드를 추가하여 완성하시오.
  
  
}

class Exercise7_10{
  public static void main(String arge[]) {
    MyTv2 t = new MyTv2();
    t.setChannel(10);
    System.out.println("CH:"+t.getChannel());
    t.setChannel(20);
    System.out.println("CH:"+t.getChannel());
    t.gotoPrevChannel();
    System.out.println("CH:"+t.getChannel());
    t.gotoPrevChannel();
    System.out.println("CH:"+t.getChannel());
  }
}

결과 
CH:10
CH:20
CH:10
CH:20
*/
/*문제 MyTv2 클래스의 멤버 변수 isPowerOn, channel, volume을 클래스 외부에서 접근할 수 없도록 제어자를 붙이고 
 * 대신 이 멤버 변수들의 값을 어디서나 읽고 변경할 수 있도록 getter와 setter 메서드를 추가하라.

class MyTv2 {
  boolean isPowerOn;
  int channel;
  int volume;

  final int MAX_VOLUME = 100;
  final int MIN_VOLUME = 0;
  final int MAX_CHANNEL = 100;
  final int MIN_CHANNEL = 1;

}

class Exercise7_10{
  public static void main(String arge[]) {
    MyTv2 t = new MyTv2();
    t.setChannel(10);
    System.out.println("CH:"+t.getChannel());
    t.setVolume(20);
    System.out.println("CH:"+t.getVolume());
  }
}

*/

package 상속과다형성.연습;

class MyTv2 {
	private boolean IsPowerOn;
	private int channel;
	private int volume;
	int set = 0;
	int get = 0;
	int tmp = 0;
	int i = 0;
	int a = 0;

	private final int MAX_VOLUME = 100;
	private final int MIN_VOLUME = 0;
	private final int MAX_CHANNEL = 100;
	private final int MIN_CHANNEL = 0;

//	MyTv2(int channel, int volume) {
//		this.channel = channel;
//		this.volume = volume;
//	}

	public void setChannel(int channel) {
		this.channel = channel;

		tmp = get;
		get = set;
		set = channel;

	}

	public int getChannel() {
		return channel;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getVolume() {
		return volume;
	}

	void gotoPrevChannel() {

		channel = get;

		tmp = get;
		get = set;
		set = tmp;

	}
}

public class 연습쓰 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyTv2 t = new MyTv2();
		/*
		 * t.setChannel(10); System.out.println("CH:" + t.getChannel());
		 * t.setVolume(20); System.out.println("CH:" + t.getVolume());
		 */

		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setChannel(20);
		System.out.println("CH:" + t.getChannel());

		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
	}

}
