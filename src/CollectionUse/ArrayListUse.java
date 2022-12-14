package CollectionUse;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListUse {

	public static void main(String[] args) {

		
//		ArrayList al=new ArrayList();
//		
//		al.add("Velocity");
//		al.add("May-21");
//		al.add(90);
//		al.add('A');
//		al.add(99.99f);
//		al.add("Velocity");
//		al.add(null);
//		al.add(null)
//		al.add("Bhaskar");
//		
//		System.out.println(al);
		
		
		ArrayList al=new ArrayList(); 
		
		al.add("Ajinkya");
		al.add(8668392460L);
		al.add("islapur");
		al.add('M');
		al.add(99.99f);
		al.add("laptop");
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		
       System.out.println(al.size());		
       
       System.out.println(al.indexOf("islapur"));
       System.out.println(al.indexOf(8668392460L));
       System.out.println(al.indexOf('M'));
       
       al.set(1, "Nitin"); //update the value
       System.out.println(al);
       al.set(2, "Kinwat");
       System.out.println(al);
       al.set(7, 'F'); 
       System.out.println(al);
       
       al.add(0,"MorningBatch");
       System.out.println(al);
       
       al.add(7,"PostOffice");
       System.out.println(al);
       
       al.add(3,"Narayan");
       System.out.println(al);
       
       al.add(4,"Mahendra");
       System.out.println(al);
       
        al.set(10, "Nanded");
        System.out.println(al);
        
        al.remove(11);
        System.out.println(al);
        
        al.remove(7);
        System.out.println(al);
        
        al.remove(8);
        System.out.println(al);
     
        Iterator it = al.iterator();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
        System.out.println("==========================");
     
        for(int i=0;i<=al.size()-1;i++)
        {
        	System.out.println(al.get(i));
        }
        System.out.println("====================");
        
        for(Object o:al)
       {
    	System.out.println(o);
       }
        
        System.out.println("========================");
        
        
        
        
        
	}
}
