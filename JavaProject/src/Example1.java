
public class Example1 {

	public static void main(String[] args) {

		int intval = 44032;
		char charval = (char) intval; // charval의 값을 char 44032로 변경
		System.out.println(charval);

		long longval = 500;
		intval = (int) longval; // intval의 값을 int 500으로 변경
		System.out.println(intval);

		double doubleval = 3.14;
		intval = (int) doubleval; // intval의 값을 int 3으로 변경
		System.out.println(intval);

	}

}
