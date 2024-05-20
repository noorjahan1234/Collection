import java.util.LinkedList;

public class Program2 {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(11);
		ll.add(22);
		ll.add(33);
		ll.add(44);
		ll.add(55);
		System.out.println(ll); //[11, 22, 33, 44, 55]
		ll.add(3,66);
		System.out.println(ll); //[11, 22, 33, 66, 44, 55]
		ll.addFirst(12);
		System.out.println(ll); //[12, 11, 22, 33, 66, 44, 55]
		ll.addLast(66);
		System.out.println(ll); //[12, 11, 22, 33, 66, 44, 55, 66]
	}

}
