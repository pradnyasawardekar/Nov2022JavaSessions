package AccessModifiers1;

public class Cycle {

	public static void main(String[] args) {

		Car cy = new Car();
		
		//access in non-sub class in same package
		
		System.out.println(cy.name);			//public
		
		//System.out.println(cy.price);		//private-->Not allowed
		
		System.out.println(cy.color);		//protected
		
		System.out.println(cy.seller);		//default

	}

}
