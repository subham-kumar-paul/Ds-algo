package sets;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
//		Set<String> fruits = new HashSet<>() ;
//		
//		fruits.add("Apple") ;
//		fruits.add("Banana") ;
//		fruits.add("Kiwi") ;
//		System.out.println(fruits.add("Mango"));
//		System.out.println(fruits.add("Banana")) ;
//		
//		System.out.println(fruits);
		
		Set<Integer> x = new HashSet<>() ;
		x.add(23) ;
		x.add(1) ;
		x.add(6) ;
		
		Set<Integer> y = new HashSet<>() ;
		y.add(3) ;
		y.add(1) ;
		y.add(16) ;
		
//		x.addAll(y) ;
//		System.out.println(x);
		
//		x.retainAll(y) ;
//		System.out.println(x);
		
		System.out.println(x.containsAll(y));
		
 
	}

}
