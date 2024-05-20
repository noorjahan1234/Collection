import java.util.*;
public class ArrayDeque1 {

	public static void main(String[] args) {
		ArrayDeque ad=new ArrayDeque();
		ad.add(11);
		ad.add("java");
		ad.add(76.89);
		ad.add('N');
		ad.add(true);
		System.out.println(ad); //[11, java, 76.89, N, true]

	}

}
