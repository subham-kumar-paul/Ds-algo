package recursion.advancedQuestions;

import java.util.*;

public class PermutationsOfaString {
	
	static Set<String> set = new HashSet<>() ; 

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		String s = sc.next() ;
		int l = 0 ;
		int r = s.length() - 1 ;
		permutations(s , l , r) ;
 
	}
	
	static void permutations(String s, int l, int r) {
		if(l==r) {
			
			if (set.contains(s)) return ;
			set.add(s) ;
			System.out.println(s);
			return ;
		}
		
		for(int i = l ; i<=r ; i++) {
			s = interchangeChar(s, l, i) ;
			permutations(s, l+1, r) ;
			s = interchangeChar(s, l, i) ;
		}
	}
	
	static String interchangeChar(String s, int a, int b) {
		char array[] = s.toCharArray() ;
		char temp = array[a] ;
		array[a] = array[b] ;
		array[b] = temp ;
		return String.valueOf(array) ;
	}

}
