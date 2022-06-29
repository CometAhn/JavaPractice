package Class; // 없을 시 왜 오류?

class sub {
	int result;

	int calculator(int a, int b) {
		result = a + b;
		return result;
	}
}

public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sub sb = new sub();
		int sum = sb.calculator(100, 200);
		System.out.print(sum);

	}

}
