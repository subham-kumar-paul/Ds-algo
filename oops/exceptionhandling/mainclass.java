package oops.exceptionhandling;

public class mainclass {

	public static void main(String[] args) {
		
		
//		try {
//		   int a = 5 ;
//		   int b = 0 ;
//	       int c = a/b ;
//		   System.out.println(c);
//		   
//		   
//		   int arr[] = new int[5] ;
//		   System.out.println(arr[6]);
//		
//
//		} catch(ArithmeticException e) {
//			System.out.println(e.getMessage() + " occured, plz check your code") ;
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(" index should be in the range");
//		} catch(IllegalArgumentException e) {
//			System.out.println("check your casting");
//		} finally {
//			System.out.println("sorry for the inconvenience");
//		}
//		
//		System.out.println("very important code" + "\n" + "needs to run" );

		
		        fun1() ;
	}
	
	
	
	static void fun1() {
		int a = 5 ;
		int b = 3 ;
		int c = a/b ;
		
		System.out.println(c);
		
//		boolean isDanger = true ;
//		if(isDanger) {
//			throw new ArrayIndexOutOfBoundsException("danger was coming") ;
//		}

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				
				
			}
			
			System.out.println("after delay");
			
		try {
		fun2() ;
			
		} catch (Exception e) {
			System.out.println(e.getMessage() + " occured");
		}
	}
	
	static void fun2() throws ArrayIndexOutOfBoundsException{
		boolean isDanger = true ;
		if(isDanger) {
			throw new ArrayIndexOutOfBoundsException("danger was coming") ;
		}
	}

}

