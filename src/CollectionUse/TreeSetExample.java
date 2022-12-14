package CollectionUse;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		TreeSet ts=new TreeSet();
		
	    ts.add("Ajinkya");
		ts.add("Pawar");
		ts.add("Bottle");
		ts.add("xyz");
		ts.add("laptop");
		ts.add("watch");
		
		System.out.println(ts);
		System.out.println(ts.isEmpty());
		System.out.println(ts.contains("xyz"));
		
		System.out.println(ts.pollFirst());
		System.out.println(ts);
		
		System.out.println(ts.pollLast());
		System.out.println(ts);
		System.out.println("===========iterator==========");
		Iterator t = ts.iterator();
		while(t.hasNext())
		{
			System.out.println(t.next());
		}
		System.out.println("=======for each=========");
		for(Object i:ts)
		{
			System.out.println(i);
		}
	}

}
