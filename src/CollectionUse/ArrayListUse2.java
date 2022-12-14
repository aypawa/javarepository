package CollectionUse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListUse2 {

	public static void main(String[] args) {

		ArrayList <Integer> al=new ArrayList();
		
		al.add(8668);
		al.add(3924);
		al.add(9421);
		al.add(9527);
		al.add(98500);
		al.add(9011);
		al.add(94033);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(4));
		System.out.println("=================");
		
		for(Integer it:al)
		{
			System.out.println(it);
		}
		System.out.println("=================");
		
		Iterator<Integer> i = al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("==================");
		
		for(int t=0;t<=al.size()-1;t++)
		{
			System.out.println(al.get(t));
		}
		System.out.println("=====================");
		
		ListIterator<Integer> li = al.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
       System.out.println("===============");
	}

	
	}


