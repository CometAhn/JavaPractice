package Ch11_Collection_Framework;

import java.util.ArrayList;
import java.util.LinkedList;

public class _3_List {

	public static void main(String[] args) {

		//// Link Start
		ArrayList list1 = new ArrayList(10);
		list1.add("A");
		list1.add("C");
		list1.add("E");
		list1.add("D");
		System.out.print("초기상태 : ");
		System.out.println(list1);

		System.out.println("인덱스 1 위치에 B추가");
		list1.add(1, "B");
		System.out.println(list1);

		System.out.println("인덱스 2 위치의 값 삭제");
		list1.remove(2);
		System.out.println(list1);

		System.out.println("인덱스 2번 위치의 값 반환 : " + list1.get(2));

		list1.set(1, "2");
		System.out.println("인덱스 1번 위치의 값 변경 : " + list1);
		//// Link End

		// ArrayList vs LinkedList Start
		ArrayList al = new ArrayList();
		LinkedList ll = new LinkedList();

		long start = System.currentTimeMillis();

		for (int i = 0; i < 100000; i++) {
			al.add(0, String.valueOf(i));
		}

		long end = System.currentTimeMillis();

		System.out.println("Arraylist 작업시간 : " + (end - start));

		start = System.currentTimeMillis();

		for (int i = 0; i < 100000; i++) {
			ll.add(0, String.valueOf(i));
		}
		end = System.currentTimeMillis();
		System.out.println("LinkedList 작업시간 : " + (end - start));
		// ArrayList vs LinkedList End
	}

}
