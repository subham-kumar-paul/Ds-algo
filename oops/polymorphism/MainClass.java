package oops.polymorphism;

public class MainClass {

	public static void main(String[] args) {
//		Dog d = new Dog() ;
//		
//		Pet p = d ;
//		
//		Animal a = d ;
//		
//		d.walk();
//		p.walk();
		
		greetings();

	}
	
	public static void greetings() {
		
		System.out.println("Hi, there");
	}
	
	public static void greetings(String s) {
		System.out.println(s);
	}

}
