package vectorsandstacks;

import java.util.*;

public class MainClass {

	public static void main(String[] args) throws Exception {
		
//		Vector<Integer> v = new Vector<>() ;
//		
//		v.add(34) ;
//		v.add(12) ;
		
//		Stack<Integer> stack = new Stack<>() ;
//		
//		stack.push(12) ;
//		stack.push(24) ;
//		stack.push(36) ;
//		
//		int popped = stack.pop() ;
//		System.out.println(popped);
//		
//	    int peeked = stack.peek();
//	    System.out.println(peeked);
	    
		
        MyStack<Integer> stack = new MyStack<>() ;
		
		stack.push(12) ;
		stack.push(24) ;
		stack.push(36) ;
		
		int popped = stack.pop() ;
		System.out.println(popped);
		
	    int peeked = stack.peek();
	    System.out.println(peeked);
				

	}

}
