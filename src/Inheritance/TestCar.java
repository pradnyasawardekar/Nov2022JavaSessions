package Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		
		Car c= new Car();
		c.start();
		c.stop();
		Car.billing();		//static
		c.refuel();
		c.engine(); 	 	//override
		Car.display();		//static and final
		c.funAutomobile();  //inherited from grand grand parents
		
		
		
		System.out.println("_______________________");
		
		BMW b=new BMW();
		b.start();			//override
		b.stop();			//inherited from Car
		BMW.billing();		//method hiding
		b.autoParking();	//individual function
		BMW.display();		//static and final
		b.refuel();
		b.petrolEngine();	//inherited from grand parent
		b.payment("pay@upi#123");
		
		System.out.println("_______________________");
		
		Audi ad= new Audi();
		ad.theftSafety();	//individual function
		ad.start();			//inherited function
		ad.engine();		//inherited function
		ad.petrolEngine();	//inherited function from grand parent
		
		
		System.out.println("_______________________");
		
		
		
		//top/up casting
		// Every BMW is a Car
		//child class can be referred by parent class reference variable
		Car c1= new BMW();
		c1.start();     //bmw
		c1.stop();      //car
		c1.payment("hello@upi");  //bmw
		c1.engine();   //bmw
		c1.refuel();   //car
		//c1.autoParking;	//not allowed
		c1.billing();		// why car function is called? why not BMW?
		c1.payment("car@upi");	//bmw
		c1.funScience();
		
		System.out.println("_______________________");
		
		
		//down casting
		//parent class object can be referred by child class reference variable
		//every car is a BMW ---> wrong stmt
		//BMW b1= new Car();		// not allowed
		
		BMW b1= (BMW) new Car();		//can be accepted at compile time  but will throw error at run time	
		//ClassCastException
		
		BMW b2= (BMW) new Vehicles();	//run time error
		//same as down casting problem
		
		
	}

}
