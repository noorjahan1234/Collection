import java.util.*;

public class IteratorPro {

	public static void main(String[] args) {
		/*
		 * ArrayDeque al=new ArrayDeque(); al.add(10); al.add(60); al.add(30);
		 * al.add(20); al.add(50); System.out.println(al);
		 * 
		 * 
		 * Iterator it=al.iterator(); while(it.hasNext()) {
		 * System.out.print(it.next()+" "); }
		 * 
		 * Iterator it= al.descendingIterator(); while(it.hasNext()) {
		 * System.out.print(it.next()+" "); }
		 */
		ArrayList al=new ArrayList();
		al.add(26);
		al.add(16);
		al.add(56);
		al.add(10);
		al.add(36);
		System.out.println(al); //[26, 16, 56, 10, 36]
		
		ListIterator lit=al.listIterator();
		while(lit.hasNext())
		{
			System.out.print(lit.next()+" ");  //26 16 56 10 36
		}
	}

}
