package _6장;

class SutdaCard {

	int num;
	boolean isKwang;

	int num() {
		if (num >= 1 && num <= 10) {
			return num;
		} else {
			num = 1;
		}
		return num;
	}

	boolean isKwang(String b) {
		if (b.equals("光")) {
			return true;
		} else {
			return false;
		}
	}

	SutdaCard() {

		this(1, true);
	}

	SutdaCard(int a, boolean isKwang) {
		this.num = a;
		this.isKwang = isKwang;
	}

	String info() {
		return num + (isKwang == true ? (String) "K" : (String) "");
	}
}

public class Exercise6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info());
		System.out.println(card2.info());
	}

}
