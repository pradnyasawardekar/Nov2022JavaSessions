package AccessModifiers2;

import AccessModifiers1.Car;

public class Audi extends Car{

	public static void main(String[] args) {

		Audi au= new Audi();
		
		//access in sub class in different package
		
		System.out.println(au.name);		//public
		
		//System.out.println(au.price);	//private-->Not allowed
		
		System.out.println(au.color);	//protected-->Not allowed??
		
		//System.out.println(au.seller);	//default-->Not allowed

	}

}
