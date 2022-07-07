package API;

public class Date_N_Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long start = System.currentTimeMillis();
		System.out.println("시작시간 : " + start);

		int a = 0;
		for (int i = 0; i < 100000000; i++) {
			a++;
		}
		long end = System.currentTimeMillis();
		System.out.println("종료시간 : " + end);
		System.out.println("걸린 작업 시간 : " + (end - start));

	}

}
