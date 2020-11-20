package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("enter a line");
		String str = sc.nextLine();
		String[] str2= str.split(" ") ;
		
		
		for(int i = str2.length - 1 ; i>=0 ; i--) {
			
			String word = str2[i] ;
			
			 
			if(i!=0)	
			System.out.print(word.trim() + " ");
			else
			System.out.print(word.trim());
			
			
			
			
		}

	}

}
