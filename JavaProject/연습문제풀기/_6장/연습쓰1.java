package _6장;

//문제 3. 아래 세 개의 클래스로부터 공통부분을 뽑아서 Unit이라는 클래스를 만들고, 이 클래스를 상속 받도록 코드를 변경 하시오.

class Unit {

	void move(int x, int y) {
	} // 지정된 위치로 이동

	void stop() {
	} // 현재 위치에 정지

}

class Marine extends Unit { // 보병
	int x, y; // 현재 위치

	void stimPack() {
	} // 스팀팩을 사용한다.
}

class Tank extends Unit { // 탱크
	int x, y; // 현재 위치

	void changeMode() {
	} // 공격모드를 변환한다
}

class Dropship extends Unit { // 수송선
	int x, y; // 현재 위치

	void move(int x, int y) {
	} // 지정된 위치로 이동

	void unload() {
	} // 선택된 대상을 내린다.
}

public class 연습쓰1 {

	public static void main(String[] args) {

	}

}
