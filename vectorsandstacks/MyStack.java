package vectorsandstacks;

import linkedLists.MyLinkedList;

public class MyStack<E> {
	
	private MyLinkedList<E> ll = new MyLinkedList<>() ;
	
	void push(E e) {		
		ll.add(e) ;		
	}
	
	E pop() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("Popping from empty stack is not allowed") ;			
		}
		
		return ll.removelast() ;
	}
	
	E peek() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("Peeking in an empty sta is not allowed") ;			
		}
		return ll.getlast() ;		
	}

}
