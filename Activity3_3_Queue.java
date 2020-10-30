package JavaActivity3_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Activity3_3_Queue {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(5);
		q.add(6);
		q.add(7);
		q.add(8);
		q.add(9);
		
		q.remove(8);
		
		System.out.println(q.peek());
		
		System.out.println("My queue size is :"+q.size());
		
		System.out.println("My updated queue is: ");
		for (int x:q) {
			System.out.print(x+ " ");
		}
		
	}

}
