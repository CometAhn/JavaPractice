package Ch10_API;

public class String_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		StringBuilder - 단일 프로그램(로켈프로그램);
//		StringBuffer - 멀티 프로그램(네트워크 프로그램);

		///////////////////////////////////////////////////////
		// concAt() : 문자열 결합
		// charAt(index) : 지정한 인덱스의 위치에 있는 문자를 반환
		// length() : 문자열의 길이를 반환
		// indexOf() : 문자나 문자열이 어디에 위치하는지 알려주는 메소드.
		// substring() : 문자열을 잘라낼 때 사용.
		// equals() : 문자열의 내용을 비교하는 메소드.
		// split() : 특정한 기호로 문자열을 구분해서 각각 배열의 요소로 저장
		// equalsIgnorecase() : 영문으로 된 문자열을 대소문자 구분없이 비교하는 메소드.일치하면 true 불일치 false
		// join() : 배열을 특정한 문자들 사이사이에 넣어서 문자열로 결합하는 메소드
		// trim() : 문자열의 앞, 뒤 공백을 제거.
		// valueOf() : 기본형을 String으로 변환.
		// format() : printf 메소드처럼문자열에 적절한 포맷 주기.
		///////////////////////////////////////////////////////

		// 기초
		// String과 String 변수 = new String 차이 기억하기.
		String city1 = "Asia";
		String city2 = "Europe";
		String city3 = new String("Asia");
		String city7 = "Asia";
		String city8 = new String("Asia");
		System.out.println(city1); // Asia
		System.out.println(city1.length()); // 4
		System.out.println(city1 == city2); // false Asia != Europe
		System.out.println(city1.equals(city2)); // false Asia != Europe
		System.out.println(city1 == city3); // true ? false Asia != Asia? false? new는 pool에 들어가지 않은 상태.
		System.out.println(city1 == city7); // true Asia = Asia
		System.out.println(city1.equals(city3)); // true Asia = Asia // Asia=Asia 텍스트는 같음.
		System.out.println(city1.equals(city7));// true Asia = Asia

		String city4 = String.format("%s-%s", city1, city2);
		System.out.println(city4); // Asia-Europe
		String city5 = city1 + "-" + city2 + 1 + 2; // 문자 + 문자 = 문자 + 문자 = 문자 + 숫자 = 문자 + 숫자 = 문자
		System.out.println(city5); // Asia-Europe12 Asia - Asia- Euro Asia-Euro 1 Asia-Euro1 +2 = Asia-Euro12
		String city6 = 1 + 2 + city1 + "-" + city2; // 숫자 + 숫자 = 숫자 + 문자 = 문자 + 문자 = 문자 + 문자= 문자
		System.out.println(city6); // 3Asia-Europe
		System.out.println();

		// split start
		String sstr = "홍길동/12312/컴퓨터공학과";
		String[] sp = sstr.split("/");
		String name = sp[0];
		String number = sp[1];
		String major = sp[2];
		System.out.println("이름 : " + name + "\n학번 : " + number + "\n전공 : " + major);
		// split end
		System.out.println();

		// join start
		String jstr = String.join("/", sp);
		System.out.println(jstr);
		// join end
		System.out.println();

		// replaceFirst start
		String rstr = "나는 가을이 좋다. 정말 가을이 좋다.";
		rstr = rstr.replaceFirst("가을", "봄");
		System.out.println(rstr);
		// replaceFirst end
		System.out.println();

		///////////////////////////////////////////////////////
		// replaceAll = replace
		// replaceAll = 특수문자 치환x
		// rplace = 특수문자 치환o
		//
		// replaceAll ex)
		// String rastr = "나는 ..이 좋다. 정말 ..이 좋다.";
		// rastr = rastr.replaceAll(".", "/");
		// output : /////////////////////
		//
		// replace ex)
		// String rastr = "나는 ..이 좋다. 정말 ..이 좋다.";
		// rastr = rastr.replace(".", "/");
		// output : 나는 //이 좋다/ 정말 //이 좋다/
		///////////////////////////////////////////////////////

		// replaceAll start
		String rastr = "나는 가을이 좋다. 정말 가을이 좋다.";
		rastr = rastr.replaceAll("가을", "봄");
		System.out.println(rastr);
		// replaceAll end
		System.out.println();

		///////////////////////////////////////////////////////
		// StringBuffer클래스의 메소드
		// append() : 매개변수로 입력된 값을 문자열로 바꾸어 더해주는 메소드
		// reverse() : 문자열의 순서를 반대로 나열하는 메소드
		// insert(int pos, Object obj) : 두 번째 매개변수의 값을 문자열로 바꿔서 pos인 위치에 추가하는 메소드
		// delete(int start, int end) : start의 위치부터 end직전의 위치의 문자열을 제거하는 메소드.
		// deleteCharAt(int index) : index위치에 있는 문자를 제거하는 메소드.v
		///////////////////////////////////////////////////////

		String rev = "무궁화"; // String 무궁화
		StringBuffer sb = new StringBuffer(rev); // StringBuffer sb = String rev.

		System.out.println(sb.reverse()); // sb 뒤집기

	}

}
