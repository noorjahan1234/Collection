package PriorityQueue;

import java.util.PriorityQueue;

public class ProgramString
{
	public static void main(String[] args) 
	{
		PriorityQueue pq=new PriorityQueue();
		pq.add("JAVA");
		pq.add("SQL");
		pq.add("HTML");
		pq.add("CSS");
		System.out.println(pq); //[CSS, HTML, JAVA, SQL]
	}
}
