package CollectionUse;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_Hash_Set_Study {

	public static void main(String[] args) {

		LinkedHashSet<Object> lh=new LinkedHashSet<>();
		
		System.out.println(lh.add("Velocity"));
		System.out.println(lh.add("Velocity"));
		
		lh.add("Ajinkya");
		lh.add("Pawar");
		lh.add(8668);
		lh.add('M');
		lh.add(null);
		lh.add('B');
		lh.add(8668);
		
		System.out.println(lh);
		System.out.println(lh.isEmpty());
		System.out.println(lh.size());
		System.out.println(lh.contains('M'));
		
		System.out.println(lh);
		
		lh.remove(8668);
		System.out.println(lh);
		System.out.println("==========iterator===========");
		Iterator<Object> it = lh.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("================for each=============");
		
		for(Object i:lh)
		{
			System.out.println(i);
		}
		
		lh.clear();
		System.out.println(lh);
		System.out.println(lh.size());
		System.out.println(lh.isEmpty());
	}

}
