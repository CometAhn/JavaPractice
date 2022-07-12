package Ch06_Class;

class User {
	private String name;
	private int age;

	User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) { // private String name 사용하기 위해 사용.
		this.name = name;
	}

	public String getName() { // private String name 사용하기 위해 사용.
		return name;
	}

	public void setAge(int age) { // private int age 사용하기 위해 사용.
		this.age = age;
	}

	public int getAge() { // private int age 사용하기 위해 사용.
		return age;
	}
}

public class AccessModifier1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user1 = new User("철수", 20);
		User user2 = new User("영희", 19);

		user2.setAge(99); // private는 같은 클래스 내에서만 사용 가능.
		// System.out.println(user1.name() + "의 나이는 " + user1.age());
		// private는 같은 클래스
		// 내에서만 사용 가능.
		System.out.println(user1.getName() + "의 나이는 " + user1.getAge());
		// System.out.println(user2.name() + "의 나이는 " + user2.age());
		// private는 같은 클래스
		// 내에서만 사용 가능.
		System.out.println(user2.getName() + "의 나이는 " + user2.getAge());
	}

}
