package oops.inheritance;

public class Teacher extends Person {
	
	
	public Teacher (String name) {
		super(name) ;
		System.out.println(name + "inside teacher constructor");
	}
	
	public void teach() {
		System.out.println(name + " teacher is teaching");
	}
		
		
		public void eat() {
			super.eat();
			System.out.println(name + " teacher is eating");
		}

		public static void laughing() {
			System.out.println("Teacher is laughing");
			
		}


}
