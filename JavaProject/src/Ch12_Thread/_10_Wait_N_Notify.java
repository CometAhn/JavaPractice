package Ch12_Thread;

class Account {
	int money;

	public int showMoney() {
		return money;
	}

	public synchronized void setMoney() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
			System.out.println(ie.toString());
		}

		this.money += 2000;

		System.out.println("어머니가 용돈을 입금했습니다. 현재 잔액" + this.showMoney());

		this.notify();
	}

	public synchronized void getMoney() {
		while (money <= 0) {
			try {
				System.out.println("통장 잔고가 없어서 아들 대기중");
				this.wait(); // 이 메서드를 호출한 놈이 잔다.
			} catch (InterruptedException e) {
				System.out.println(e.toString());
			}
		}
		this.money -= 2000;
		System.out.println("아들이 용돈을 출금했습니다. 현재 잔액 :" + this.showMoney());
	}
}

class Son extends Thread {
	private Account account;

	Son(Account account) {
		this.account = account;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			account.getMoney();
		}
	}
}

class Mom extends Thread {
	private Account account;

	Mom(Account account) {
		this.account = account;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			account.setMoney();
		}
	}
}

public class _10_Wait_N_Notify {

	public static void main(String[] args) {

		Account account = new Account();
		Son son = new Son(account);
		Mom mom = new Mom(account);

		son.start();
		mom.start();

	}

}
