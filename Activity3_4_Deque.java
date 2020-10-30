package JavaActivity3_Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Activity3_4_Deque {

	public static void main(String[] args) {
		Deque<String> dq = new ArrayDeque<>();
		
		dq.add("horse");
		dq.add("mouse");
		dq.add("rabbit");
		dq.add("dog");
		dq.add("cat");
		dq.add("donkey");
		
		System.out.println("Size of the original deque is "+dq.size());
		System.out.println("My original deque is:");
		for(String x:dq) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("My head element is "+ dq.peekFirst());
		
		System.out.println("My tail element is "+ dq.peekLast());
		
		System.out.println("Is wolf a part of my deque? "+ dq.contains("Wolf"));
		
		dq.removeFirst();
		dq.removeLast();
		
		System.out.println("Size of the updated deque is "+dq.size());
	}

}
