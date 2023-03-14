package AccessModifiers1;

public class Car {
	
	public String name;		//public	
	private int price;		//private
	protected String color;	//protected
	String seller;			//default
	

	public static void main(String[] args) {
		
		Car c= new Car();
		
		//same class access
		
		System.out.println(c.name);		//public
		
		System.out.println(c.price);	//private
		
		System.out.println(c.color);	//protected
		
		System.out.println(c.seller);	//default
		
	}

}
