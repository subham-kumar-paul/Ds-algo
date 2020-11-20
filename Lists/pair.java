package Lists;

public class pair<X,Y,Z> {
	
	X x ;
	Y y ;
	Z z ;
	public pair(X x , Y y , Z z) {
		this.x = x ;
		this.y = y ;
		this.z = z ;
	}
	
	public void getDescription() {
		System.out.println(x + " and " + y + " and " + z);
	}

}
