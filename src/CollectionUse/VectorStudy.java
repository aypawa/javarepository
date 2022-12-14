package CollectionUse;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) {

		Vector v=new Vector();
		
		v.add("Sheru");
		v.add("Ajinkya");
		v.add("pawar");
		v.add('M');
		v.add(8668392460L);
		v.add(88.88f);
		v.add("Sheru");
		v.add(null);
		v.add(null);
		
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
		
		System.out.println(v.isEmpty());
		//System.out.println(v.contains(1));
		
		System.out.println(v.indexOf("Ajinkya"));
		
		System.out.println(v.get(4));
		
		v.add(0,"Pune");
		System.out.println(v);
		System.out.println(v.get(9));
		
        v.remove(3);
        System.out.println(v);
        
        for(Object o:v)
        {
        	System.out.println(o);
        }
        System.out.println("===============");
        
        Iterator i = v.iterator();
        while(i.hasNext())
        {
        	System.out.println(i.next());
        }
		 System.out.println("==================");
		 
        ListIterator li = v.listIterator();
        while(li.hasNext());
        {
        	System.out.println(li.next());
        }
        System.out.println("===================");
        
       Enumeration en = v.elements();
       
       while(en.hasMoreElements())
       {
    	   System.out.println(en.nextElement());
       }
		System.out.println("======================");
		
		for(int it=0;it<=v.size()-1;it++)
		{
			System.out.println(v.get(it));
		}
		
		
		
		
		
		
	}

}
