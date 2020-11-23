package questions;

import java.util.*;


public class GroupAnagrams {

	public static void main(String[] args) {
		Solution solution = new Solution() ;
		
		Scanner sc = new Scanner(System.in) ;
		int n = sc.nextInt() ;
		String strs[] = new String[n] ; 
		for(int i = 0 ; i<n ; i++) {
			strs[i] = sc.next() ;
		}
		
		System.out.println(solution.groupAnagrams(strs)) ;
		System.out.println("Subham") ;

	}

static class Solution {
	    public List<List<String>> groupAnagrams(String[] strs) {
	        
	        Map<String, List<String>> map = new HashMap<>() ;
	        for(String s: strs) {
	            char charArray[] = s.toCharArray() ;
	            Arrays.sort(charArray) ;
	            String sorted = new String(charArray) ;
	            
	            if(!map.containsKey(sorted)) {
	                map.put(sorted, new LinkedList<String>())  ;
	            }
	            map.get(sorted).add(s) ;
	            
	        }
	        
	        return new LinkedList<>(map.values()) ;
	        
	    }
	}
	
}

