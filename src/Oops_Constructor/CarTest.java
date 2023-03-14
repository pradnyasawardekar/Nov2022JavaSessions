package Oops_Constructor;

public class CarTest {

	public static void main(String[] args) {

		
	//create/post/add data	
		Car c1=new Car();
		Car c2=new Car("BMW","Black");
		Car c3=new Car("Audi","White",80,true);
		
		
	//fetch/get data	
		c1.printInfo();
		c2.printInfo();
		c3.printInfo();
		

	}

}
