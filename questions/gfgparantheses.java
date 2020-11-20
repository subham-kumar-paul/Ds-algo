package questions;

import java.util.* ;


public class gfgparantheses {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in) ; 
		
		int t = sc.nextInt() ;
		
		while(t-- >0) {
			String st = sc.next();
			if(new Parenthesis().ispar(st) == true)
				System.out.println("balanced");
			else
				System.out.println("not balanced");
		}

	}

}



class Parenthesis 
{
    
    static boolean ispar(String x)
    {
        boolean isbalanced = false ;
        Stack<Character> str = new Stack<>() ;
        
       
          
        
            for(int i = 0 ; i<x.length() ; i++) {
                char ch = x.charAt(i) ; 
                
                if((ch == '(' ) || (ch == '{' ) || (ch == '[' )) {
                    str.push(ch) ;
                    continue ; 
                } 
                
                if(str.isEmpty()) {
                    isbalanced = false ;
                    break ;
                }
                
                
                if(ch == ')' )  {
                    if(str.peek() == '(' ) {
                        str.pop() ;
                    } else {
                        isbalanced = false ;
                        break ;
                    }
                } 
                
                if(ch == '}' )  {
                    if(str.peek() == '{' ) {
                        str.pop() ;
                    } else {
                        isbalanced = false ;
                        break ;
                    }
                } 
                
                if(ch == ']' )  {
                    if(str.peek() == '[' ) {
                        str.pop() ;
                    } else {
                        isbalanced = false ;
                        break ;
                    }
                }  
                
                isbalanced = true ;
               
            }
            
             if(!str.isEmpty()) {
                    isbalanced = false ;
                    
                }
                return isbalanced ;
               
       
    }
}

