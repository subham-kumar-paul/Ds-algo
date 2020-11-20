package ARRRRR;

import java.util.Scanner;

public class Indexitem {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		System.out.println("input the strength of array");
		int N = sc.nextInt() ;
		
		int A[] = new int[N];
		System.out.println("input the items of array");
		
		for(int i = 0 ; i<N ; i++){
		    
		    A[i] = sc.nextInt();
		}
		
		System.out.println("input the index");
		int T = sc.nextInt();
		
		System.out.println("the no. at index is : " + A[T]);

	}

}
