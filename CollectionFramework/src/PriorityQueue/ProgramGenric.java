package PriorityQueue;

import java.util.PriorityQueue;

public class ProgramGenric {

	public static void main(String[] args) {
		//Creating PriorityQueue to store only Integer values
		PriorityQueue<Integer> pq1=new PriorityQueue<Integer>();
		pq1.add(10);
		pq1.add(30);
		pq1.add("java");//Error
		pq1.add(98.48);//Error
		pq1.add('A');//Error
		System.out.println(pq1);
		//Creating PriorityQueue to store only String values
		PriorityQueue<String> pq2=new PriorityQueue<String>();
		pq2.add(10);
		pq2.add(30);
		pq2.add("java");//Error
		pq2.add(98.48);
		pq2.add('A');
		System.out.println(pq2);

	}

}
