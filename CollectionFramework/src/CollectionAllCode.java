import java.util.*;

public class CollectionAllCode {

	public static void main(String[] args)
	{
		/*
		 * ArrayList al=new ArrayList();
		 * al.add(10); 
		 * al.add(20);
		 * al.add(50); 
		 * al.add(40);
		 * al.add(30); 
		 * System.out.println(al); // [10, 20, 50, 40, 30] 
		 * al.set(3, 35);
		 * System.out.println(al); // [10, 20, 50, 35, 30]
		 *  Collections.sort(al);
		 * System.out.println(al); // [10, 20, 30, 35, 50]
		 */	
	
	    ArrayList<Integer> ad=new ArrayList<Integer>();
	    ad.add(70);
	    ad.add(40);
	    ad.add(10);
	    ad.add(30);
	    ad.add(50);
	    ad.add(60);
	    System.out.println(ad);  //[70, 40, 10, 30, 50, 60]
	    Collections.reverse(ad);
	    System.out.println(ad); //[60, 50, 30, 10, 40, 70]
	}
}
