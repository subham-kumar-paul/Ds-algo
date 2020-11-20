package questions;
import java.util.Arrays;
import java.util.Scanner;

public class hackerrank {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt() ;
			int a[] = new int[n] ;
			
			for(int i = 0 ; i<n ; i++) {
				a[i] =sc.nextInt() ;
			
			}
			
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
				System.out.println(c[i]);
				sum = sum + (long)c[i] ;
				
			}
			System.out.println(sum);
		}

	}

}
