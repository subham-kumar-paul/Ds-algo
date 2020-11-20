package questions;

import java.util.Arrays;
import java.util.Scanner;



public class hackerrankcandies {
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int size = sc.nextInt() ;
			int arr[] = new int[size] ;
			for(int i = 0 ; i<size ; i++) {
				arr[i] = sc.nextInt() ;
			}
				long sum = candies(size , arr) ;
				
				System.out.println(sum);
		}
		
		
	}
	
	 static long candies(int n , int a[]) {
		
	
		
		int c[] = new int[n] ;
		Arrays.fill(c, 1);
		
		for(int i = 1 ; i<n ; i++) {
			if(a[i]>a[i-1])
			{
				c[i] = c[i-1] + 1 ;
			}
		}
		
		for(int i = n-2 ; i>=0 ; i--) {
			if(a[i]>a[i+1])
			{
				c[i] = Math.max(c[i+1] + 1 , c[i]) ;
			}
		}
		
		
		long sum = 0 ;
		for(int i = 0 ; i<n ; i++) {
			sum = sum + (long)c[i] ;
			
		}
		
		return sum ;
		
	}
}
	

	

