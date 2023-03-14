package BuilderPattern;

public class User {

	public static void main(String[] args) {


		ShoppingCart cart= new ShoppingCart();
		
		cart.login()
			.doSearch("tshirt")
				.addToCart("nike tshirt")
					.doPayment("upi123")
						.logOut();
		

		
		System.out.println("_________________");
		
		cart.login("user", "pass")
		.doSearch("tshirt", 1234.23)
			.addToCart("nike tshirt")
				.doPayment("upi123")
					.logOut();
	
		
	}

}
