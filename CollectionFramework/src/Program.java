import java.util.ArrayList;
import java.util.Collections;

public class Program {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		//adding element
		al.add(10);
		al.add(20);
		al.add("java");
		al.add(98.45f);
		al.add(true);
		System.out.println(al);//[11, java, 76.89, N, true]
		//added index element
		al.add(3, "sql");
		System.out.println(al); // [10, 20, java, sql, 98.45, true]
		//using get element
			Object ele=al.get(4);
		System.out.println(ele); //98.45
		// size element
		int s=al.size();
		System.out.println(s);//6
		//remove element
		al.remove(3);
		System.out.println(al); //[10, 20, java, 98.45, true]
		//use loop
		for(int i=0; i<al.size(); i++)
		{
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		//sorted ArrayList
		Collections.sort(al);
		System.out.println(al);
	}

}
