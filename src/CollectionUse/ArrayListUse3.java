package CollectionUse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListUse3 {

	public static void main(String[] args) {

		ArrayList<String> a=new ArrayList();
		
		a.add("Ajinkya");
		a.add("Yeshwantrao");
		a.add("Pawar");
		a.add("Shreyas");
		a.add("Sanjay");
		a.add("Puyad");
		a.add("Sheru");
		
		System.out.println(a);
		System.out.println("==================");
		
		for(String i:a)
		{
			System.out.println(i);
		}
		System.out.println("====================");
		
		for(int t=0;t<=a.size()-1;t++)
		{
			System.out.println(a.get(t));
		}
		System.out.println("=====================");
		
		Iterator<String> it = a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("=================");
		
		ListIterator<String> li = a.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
	}

}
