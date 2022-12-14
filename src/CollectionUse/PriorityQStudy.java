package CollectionUse;

import java.util.PriorityQueue;

public class PriorityQStudy {

	public static void main(String[] args) {

		PriorityQueue pq=new PriorityQueue();
		
		pq.add("abc");
		pq.add("xyz");
		pq.add("pqr");
		pq.add("aaa");
		pq.add("aab");
		pq.add("lmn");
		
		System.out.println(pq);
		System.out.println(pq.element());
		System.out.println(pq);
		
		System.out.println(pq.poll());
		System.out.println(pq);
		
		System.out.println(pq.peek());
		System.out.println(pq);
		
		System.out.println(pq.remove());
		System.out.println(pq);
		
		pq.poll();
		pq.poll();		
		System.out.println(pq);
		
	}

}
