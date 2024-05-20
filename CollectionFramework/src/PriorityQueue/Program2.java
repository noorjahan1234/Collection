package PriorityQueue;

import java.util.PriorityQueue;

public class Program2 {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		pq.add(10);
		pq.add(30);
		pq.add("java");
		pq.add(98.48);
		pq.add('A');
		System.out.println(pq);				//Exception ClassCastException																

	}

}
