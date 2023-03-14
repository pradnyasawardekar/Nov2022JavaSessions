package Inheritance;

public class Car extends Vehicles{
	
	public void start(){
		System.out.println("Car----Start");
	}
	
	public void stop(){
		System.out.println("Car----Stop");
	}

	
	public void refuel(){
		System.out.println("Car----Refuel");
	}

	
	public static void billing(){
		System.out.println("Car----Billing");
	}

	
	public static final void display(){
		System.out.println("Car----Display");
	}
	
	public void running(){
		System.out.println("Car----Running");
	}
	
	public void payment(String cc, int cvv){
		System.out.println("Car----payment using: "+cc+" "+cvv);
	}
	
	public void payment(String upi){
		System.out.println("Car----payment using: "+upi);
	}
	
//	@Override
//	public void engine(){
//		System.out.println("Car----Engine");
//	}
//	
	
	
	
	

}
