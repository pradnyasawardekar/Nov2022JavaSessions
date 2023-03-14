package Inheritance;

public class BMW extends Car{
	
	@Override
	public void start(){
		System.out.println("BMW----Start");
	}
	
	@Override
	public void engine(){
		System.out.println("BMW----Engine");
	}
	
	//individual function
	public void autoParking(){
		System.out.println("BMW----Auto Parking");
	}
	
	//Not @Override--->Method hiding as its static function
	public static void billing(){
		System.out.println("BMW----Billing");
	}	
		
	@Override  //override as well as overload also
	public void payment(String cc, int cvv){
		System.out.println("BMW----payment using: "+cc+" "+cvv);
	}
	
	@Override	//override as well as overload also
	public void payment(String upi){
		System.out.println("BMW----payment using: "+upi);
	}



}
