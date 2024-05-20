import java.util.*;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList al=new ArrayList();
		System.out.println("Enter a element");
		al.add(sc.nextInt());
		al.add(sc.nextInt());
		al.add(sc.nextInt());
		al.add(sc.nextInt());
		al.add(sc.nextInt());
		System.out.println(al); //[66, 33, 44, 11, 77]
		Collections.sort(al);
		System.out.println(al); //[11, 33, 44, 66, 77]
	}
}
