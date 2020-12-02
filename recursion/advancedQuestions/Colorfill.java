package recursion.advancedQuestions;

import java.util.Scanner;

public class Colorfill {

	public static void main(String[] args) {
//		int a[][] = {{1, 1, 1, 1, 1, 1, 1, 1},
//				     {1, 1, 1, 1, 2, 2, 0, 0},
//				     {1, 0, 0, 1, 1, 0, 1, 1},
//				     {1, 2, 2, 2, 2, 0, 1, 0},
//				     {1, 1, 1, 2, 2, 0, 1, 0},
//				     {1, 1, 1, 2, 2, 2, 2, 0},
//				     {1, 1, 1, 1, 1, 2, 1, 1},
//				     {1, 1, 1, 1, 1, 2, 2, 1}} ;
		
		Scanner sc = new Scanner(System.in) ;
		int rowcount = sc.nextInt() ;
		int colcount = sc.nextInt() ;
		int a[][] = new int[rowcount][colcount] ;
		for(int i = 0 ; i < rowcount ; i++) {			
			for(int j = 0 ; j<colcount ; j++) {
				a[i][j] = sc.nextInt() ; 
			}
		}
		
		
		printMatrix(a) ;
		floodFill(a, 4, 3, 7, 2) ;
		System.out.println();
		printMatrix(a) ;

	}
	
	static void floodFill(int a[][], int r, int c, int toFill, int prevFill) {
		int rows = a.length ;
		int cols = a[0].length ;
		
		if(r < 0 || r >= rows || c < 0 || c >= cols) {
			return ;
		}
		if(a[r][c] != prevFill) {
			return ;
		}
		a[r][c] = toFill ;
		
		floodFill(a, r-1, c, toFill, prevFill) ;
		floodFill(a, r, c-1, toFill, prevFill) ;
		floodFill(a, r+1, c, toFill, prevFill) ;
		floodFill(a, r, c+1, toFill, prevFill) ;
		
	}
	
	static void printMatrix(int a[][]) {
		System.out.println(a.length);
		System.out.println(a[0].length);
		for(int i = 0 ; i < a.length ; i++) {			
			for(int j = 0 ; j< a[0].length ; j++) {
				System.out.print(a[i][j] + " ");
			}
				System.out.println();
		}
		
	}

}


//8
//8
//1 1 1 1 1 1 1 1 
//1 1 1 1 2 2 0 0 
//1 0 0 1 1 0 1 1 
//1 2 2 2 2 0 1 0 
//1 1 1 2 5 0 1 0 
//1 1 1 2 2 2 2 0 
//1 1 1 1 1 2 1 1 
//1 1 1 1 1 2 2 1 


