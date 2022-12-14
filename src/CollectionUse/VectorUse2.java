package CollectionUse;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorUse2 {

	public static void main(String[] args) {

		Vector<Integer> v=new Vector();
		 
		v.add(9890);
		v.add(2030);
		v.add(4050);
		v.add(6070);
		v.add(7080);
		v.add(9000);
		v.add(1010);
		
		System.out.println(v);
		
		for(Integer vi:v)
		{
			System.out.println(vi);
		}
		System.out.println("========================");
		for(int it=0;it<=v.size()-1;it++)
		{
			System.out.println(v.get(it));
		}
	    System.out.println("=========Iterator============");
	    
	    Iterator<Integer> vt = v.iterator();
	    while(vt.hasNext())
	    {
	    	System.out.println(vt.next());
	    }
	    System.out.println("==========listIterator=============");
	    
	    ListIterator<Integer> vl = v.listIterator();
	    while(vl.hasNext())
	    {
	    	System.out.println(vl.next());
	    }
	    System.out.println("==========Enumeration==================");
	    
	    Enumeration<Integer> en = v.elements();
	    while(en.hasMoreElements())
	    {
	    	System.out.println(en.nextElement());
	    }
	    
	}
	

}
