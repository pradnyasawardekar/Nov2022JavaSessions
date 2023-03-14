package AccessModifiers1;

public class BMW extends Car{

	public static void main(String[] args) {

		BMW b = new BMW();
		
		//access in sub class in same package
		
		System.out.println(b.name);			//public
		
		//System.out.println(b.price);		//private-->Not allowed
		
		System.out.println(b.color);		//protected
		
		System.out.println(b.seller);		//default
		

	}

}
