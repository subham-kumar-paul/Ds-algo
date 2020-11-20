package oops.inheritance;

public class Singer extends Person {
	

	public Singer (String name) {
		super(name) ;
		System.out.println(name + "inside singer constructor");
	}
	
	public void sing() {
		System.out.println(name + " singer is singing");
		
	}
	
	public void eat() {
		System.out.println(name + " singer is eating");
	}
	
	
	public static void laughing() {
		System.out.println("Singer is laughing");
		
	}

}
