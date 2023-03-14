package SeleniumSessions;

import java.util.Objects;

public class Car {
	
	//name, price, color, wheels
	String name;
	double price;
	String color;
	static final int wheels=4;
	static int steering=1;
	
	public void start(String name){
		System.out.println("Car---- Start: "+name);		
	}
	
	
	public void stop(String name){
		System.out.println("Car---- Stop: "+name);
	}
	
	
	public static void speedTest(String name){
		System.out.println("Car---- Speed Test: "+ name);
	}
	
	
	public static void printInfo(){
		System.out.println();
		System.out.println("Other details are:");
		System.out.println("No of wheels: "+wheels);
		System.out.println("No of steering: "+steering);
	}
	
	

	public static void main(String[] args) {
		
	//cannot create a static local variable	
		//static int i=10;		-->wrong
		
	
		Car c1= new Car();
		c1.name= "BMW";
		c1.price= 90.9;
		c1.color= "Black";
		//c1.steering=1;
			
		c1.start(c1.name);
		c1.stop(c1.name);
		Car.speedTest(c1.name);
	//	Car.printInfo();
		
//calling static variables n static methods
	//direct calling
		steering=2;
		printInfo();
		
	//using class name
		Car.steering=6;
		Car.printInfo();
	
	//using object name--->gives warning
		c1.steering=3;
		c1.printInfo();
		
		
//calling static variable from other class		
		System.out.println("Value of static var from class MethodOverloading is: "+MethodOverloading.staticVarTest);
		
		
		System.out.println("My name is 'Pradnya'");
		
		System.out.println("My name is \"Pradnya\"");

	}

}
