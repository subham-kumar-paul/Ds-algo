package oops.interfaces;

public class person implements student , youtuber {

	public static void main(String[] args) {
		
		
		person obj = new person() ;
		obj.study();   
		obj.makevideo() ;
		
		youtuber obj2 = obj ;
		obj2.editvideo();
		obj2.makevideo();
		obj2.uploadvideo();

	}
	
	
	@Override
	public void study() {
		System.out.println("person is studying");
		
	}

	@Override
	public void makevideo() {
		System.out.println("person is making youtube videos");
		
	}


	@Override
	public void editvideo() {
        System.out.println("editor is editing");
		
	}
	@Override
	public void uploadvideo() {
		
	}

}
