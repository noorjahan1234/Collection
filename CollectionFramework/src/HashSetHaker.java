import java.util.Scanner;
import java.util.*;

public class HashSetHaker {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
    Set<List<String>> set=new HashSet<>();
    for(int i=0; i<t; i++)
    {
        List<String> list=Arrays.asList( pair_left[i],  pair_right[i]);
        set.add(list);
    }
    System.out.println(set.size());

   }
}
