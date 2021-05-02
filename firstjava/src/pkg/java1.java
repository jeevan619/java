package pkg;

import java.util.HashSet;
import java.util.Iterator;

public class java1 {
public static void main(String[] args) {
		
		HashSet<Integer> set=new HashSet<Integer>();
		set.add(14);
		set.add(334);
		set.add(null);
		set.add(null);
		set.add(12);
		
		
		Iterator<Integer> ref=set.iterator();
		while(ref.hasNext())
		{
			Object obj=ref.next();
			System.out.println(obj);
		}
		

}
}