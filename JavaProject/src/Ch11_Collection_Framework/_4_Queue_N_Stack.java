package Ch11_Collection_Framework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _4_Queue_N_Stack {

	public static void main(String[] args) {

		Stack st = new Stack();
		Queue q = new LinkedList();

		st.push("a");
		st.push("1");
		st.push("2");

		q.offer("a");
		q.offer("1");
		q.offer("2");

		System.out.println("====== Stack =====");
		while (!st.isEmpty()) {
			System.out.println(st.pop());
		}

		System.out.println("====== Queue =====");
		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}

	}

}
