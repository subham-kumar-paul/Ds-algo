package priorityQueues;

import java.util.PriorityQueue;

public class MainClass {

	public static void main(String[] args) {
		
		PriorityQueue<String> pq = new PriorityQueue<>() ;
		
		pq.add("kiwi") ;
		pq.add("apple") ;
		pq.add("mango") ;
		pq.add("banana") ;
		
		System.out.println(pq);
		
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		
		PriorityQueue<Integer> bq = new PriorityQueue<>() ;
		
		bq.add(45) ;
		bq.add(12) ;
		bq.add(1) ;
		bq.add(100) ;
		
		System.out.println(bq);
		
		System.out.println(bq.peek());
		
		System.out.println(bq.remove());
		System.out.println(bq.remove());
		System.out.println(bq.remove());
		System.out.println(bq.remove());
		
	}

}
