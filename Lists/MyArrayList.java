package Lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
		
		List<String> fruits = new LinkedList<>() ;
		List<String> vegetables = new ArrayList<>() ;
		
		fruits.add("Apple") ;
		fruits.add("orange") ;
		fruits.add("hi") ;
		
		String temp[] = new String[fruits.size()] ;
		fruits.toArray(temp) ;
		for(String e: temp) {
			System.out.println(e);
		}
		
		vegetables.add("potato") ;
		vegetables.add("tomato") ;
		vegetables.add("carrot") ;
		
		fruits.addAll(vegetables) ;
		
		fruits.set(2, "mango") ;
		
//		fruits.remove(3) ;
//		List<String> toRemove = new ArrayList() ;
//		toRemove.add("Apple") ;
//		toRemove.add("hi") ;
//		
//		fruits.removeAll(toRemove) ;
		
//		fruits.clear() ;
		
		System.out.println(fruits);
		System.out.println(fruits.contains("guava")) ;
		System.out.println(fruits.size());
		System.out.println(fruits.isEmpty());
		System.out.println(fruits.get(3));
		
		
//		ArrayList<Integer> marks = new ArrayList() ;
//		
//		pair<String, Integer, String> p1 = new pair("paul" , 456 , "kumar") ;
//		pair<Boolean, String, String> p2 = new pair(true, "hello" , "paul") ;
//		
//		p1.getDescription();
//		p2.getDescription();
	}

}
