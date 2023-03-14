package Oops_Constructor;

public class Car {
	
	String name;
	String color;
	int price;
	boolean isAutomatic;
	
	
	public void getCarMileage(){
	System.out.println("Car mileage function");
		
	}
	
	public void printInfo(){
		System.out.println(name+" "+color+" "+ price +" "+isAutomatic);
	}
	
	
// const is not a function but it looks like function
// has same name as class name
//cannot return anything
// helping to control the object creation
// called when you create an object
// const overloading is possible
// default/ hidden constructor is called by JVM if no const is written
//	default/hidden const has 0 parameters
	
	
	public Car(){
		
	}
	public Car(String name, String color){
		this.name=name;
		this.color=color;
		
	}

	public Car(String name, String color, int price, boolean isAutomatic) {
		this.name = name;
		this.color = color;
		this.price = price;
		this.isAutomatic = isAutomatic;
	}
	
	
	
	
	
	

}
