package CollectionUse;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListUse {

	public static void main(String[] args) {

		LinkedList<Object> ll=new LinkedList();
		
		ll.add("Ajinkya");
		ll.add("Yeshwant");
		ll.add("Pawar");
		ll.add(8668392460L);
		ll.add(86.66F);
		ll.add('M');
		ll.add(null);
		ll.add(null);
		ll.add("Ajinkya");
		ll.add("laptop");
		
		System.out.println(ll);
		System.out.println("=====================");
		for(Object l:ll)
		{
			System.out.println(l);
		}
		System.out.println("=================");
		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}
		System.out.println("==================");
		
		Iterator<Object> lt = ll.iterator();
		while(lt.hasNext())
		{
			System.out.println(lt.next());
		}
		System.out.println("===================");
		
		ListIterator<Object> li = ll.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("====================");
		
		System.out.println(ll.contains("Ajinkya"));
		
		System.out.println(ll.indexOf("Ajinkya"));
		System.out.println(ll.lastIndexOf("Ajinkya"));
		
		ll.add(3,200);
		System.out.println(ll);
		
		ll.remove(3);
		System.out.println(ll);
		
		ll.set(0, "Good Morning");
		System.out.println(ll);
		
		System.out.println(ll.isEmpty());
		
		System.out.println(ll.peek());
		System.out.println(ll);
		
		System.out.println(ll.peekFirst());
		System.out.println(ll);
		
		System.out.println(ll.peekLast());
		System.out.println(ll);
		
		System.out.println(ll.poll());
		System.out.println(ll);
		
		System.out.println(ll.pollFirst());
		System.out.println(ll);
		
		System.out.println(ll.pollLast());
		System.out.println(ll);
		
		System.out.println(ll.pop());
		System.out.println(ll);

}
}