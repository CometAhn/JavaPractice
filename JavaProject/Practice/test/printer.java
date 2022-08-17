package test;
import java.util.ArrayList;

public class printer {
	void pt() {
		ArrayList<dto> tmp_bank = dao.bank;
		for (int i = 0; i < tmp_bank.size(); i++) {
			dto dt = new dto();
			dt = tmp_bank.get(i);
			String name = dt.getName();
			int age = dt.getAge();
			System.out.println(name);
			System.out.println(age);
		}
	}
}
