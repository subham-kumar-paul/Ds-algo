package questions;

import java.util.*;

public class K_largest_elements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		int t = sc.nextInt();
		
		while(t>0) {
			int n = sc.nextInt() ;
			int k = sc.nextInt() ;
			
			int arr[] = new int[n] ;
			for(int i = 0 ; i < n ; i++) 
				arr[i] = sc.nextInt();
			Solution T = new Solution() ;
			ArrayList<Integer> list = T.kLargest(arr, n, k) ;
			for(int i = 0 ; i <list.size() ; i++) 
				System.out.print(list.get(i) + " ");
			System.out.println();
			t-- ;
		}

	}

}


class Solution
{
    public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>() ;
        for(int i = 0 ; i<n ; i++) {
            if(i<k) {
                pq.add(arr[i]);
               
            } else {
                if(pq.peek() < arr[i]) {
                    pq.remove() ;
                    pq.add(arr[i]) ;
                }
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>(pq) ;
        Collections.sort(ans, Collections.reverseOrder()) ;
        return ans ;
        
    }
}
