package oops.finalKeyword;

public class Student {
	
	 int rollno ;
	 String name ;
	
//	{
//		rollno = 29 ;            //this block is called initializer block.
//	}
//	
//	public Student() {
//		name = "paul" ;
//	}

	 public final void getDescription() {
		 System.out.println("the student name is" + name) ;
		 
	 }
	 
}
