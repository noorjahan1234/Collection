import java.util.*;

public class LinkedListArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList ll=new LinkedList();
		System.out.println("Enter the element");
		ll.add(sc.nextInt());
		ll.addLst(sc.nextInt());
		ll.addLst(sc.nextInt());
		ll.addLst(sc.nextInt());
		System.out.println(ll);
		ll.addLst(4, (sc.nextInt()));
		System.out.println(ll);
	}

}
