import java.util.*;

public class ItratorQuque {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(30);
		al.add(2,20);
		System.out.println(al);
		ListIterator lt=al.listIterator();
		while(lt.hasNext())
		{
			System.out.print(lt.next()+" ");
		}
		System.out.println();
		for(int i=0; i<al.size(); i++){
			System.out.println(al.get(i));
		}
		for(Object x: al)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		
		ArrayDeque ad=new ArrayDeque();
		ad.add(30);
		ad.add(10);
		ad.add(40);
		for(Object x: ad)
		{
			System.out.println(x+" ");
		}
		Iterator adtr=ad.descendingIterator();
		while(adtr.hasNext())
		{
			System.out.print(adtr.next()+" ");
		}
	}
}
