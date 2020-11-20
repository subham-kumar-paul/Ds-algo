package oops.abstraction;

public class RepairShop {

	
		public static void repairCar(Car car) {
			System.out.println("car is repaired");
		}
		
		
		
		public static void main(String[] args) {
			Wagonr WagonR = new Wagonr() ;
			Audi audi = new Audi() ;
			
			repairCar(WagonR) ;
			repairCar(audi) ;
 			
		}

}
