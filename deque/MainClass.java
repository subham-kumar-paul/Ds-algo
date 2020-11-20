package deque;

import java.util.ArrayDeque;

public class MainClass {

	public static void main(String[] args) {
		
//		ArrayDeque<Integer> ad = new ArrayDeque<>() ;
		
//		ad.addFirst(12) ;                
//		ad.addFirst(23) ;
//		
//		ad.pop();                           //"queue methods"
//		System.out.println(ad.peek());
		
//		ad.push(12) ;
//		ad.push(23) ;
//		ad.push(34) ;
//		
//		System.out.println(ad.pop());          //"stack methods"
//		System.out.println(ad.pop());
		
		MyDeque<Integer> ad = new MyDeque<>() ;
		
		ad.addToHead(12) ;
		ad.addToHead(23) ;
		ad.addToHead(44) ;
		ad.addToHead(60) ;
		
		
		
		System.out.println(ad.removeLast());
		
		
		
		

	}

}
