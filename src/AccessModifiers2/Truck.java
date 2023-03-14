package AccessModifiers2;

import AccessModifiers1.Car;

public class Truck {

	public static void main(String[] args) {


		Car tr= new Car();
		
		//access in non-sub class in different package
		
		System.out.println(tr.name);		//public
		
		//System.out.println(tr.price);	//private-->Not allowed
		
		//System.out.println(tr.color);	//protected-->Not allowed
		
		//System.out.println(tr.seller);	//default-->Not allowed


	}

}
