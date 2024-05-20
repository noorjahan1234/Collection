import java.util.*;

public class ArrayListKod 
{
	public static void main(String[] args)
	{
	 Scanner scanner = new Scanner(System.in);



	    // Read the first ArrayList

	    ArrayList<Integer> list1 = new ArrayList<>();

	    while (scanner.hasNextInt()) {

	      list1.add(scanner.nextInt());

	    }



	    // Read the second ArrayList

	    ArrayList<Integer> list2 = new ArrayList<>();

	    while (scanner.hasNextInt()) {

	      list2.add(scanner.nextInt());

	    }



	    // Merge the ArrayLists

	    ArrayList<Integer> mergedList = new ArrayList<>(list1);

	    mergedList.addAll(list2);



	    // Sort the merged list

	    Collections.sort(mergedList);



	    // Print the result

	    for (int num : mergedList) {

	      System.out.print(num + " ");

	    }



	    scanner.close();

	  }
}
