package BuilderPattern;

public class ShoppingCart {
	
//each function or method will return a this object	
	
	public ShoppingCart login(){
		System.out.println("Log  in successfull");
		return this;
	}
	
	public ShoppingCart login(String user, String pwd){
		System.out.println("Log  in successfull using: "+user+" "+ pwd);
		return this;
	}
	
	public ShoppingCart doSearch(String prodName){
		System.out.println("Product searched: "+prodName);
		return this;
	}
	
	public ShoppingCart doSearch(String prodName, double price){
		System.out.println("Product searched: "+prodName+" "+price);
		return this;
	}
	
	public ShoppingCart doSearch(String prodName, double price, String brand){
		System.out.println("Product searched: "+prodName+" "+price+" "+brand);
		return this;
	}

	public ShoppingCart addToCart(String prodName){
		System.out.println("Added to cart: "+prodName);
		return this;
	}
	
	public ShoppingCart doPayment(String upi){
		System.out.println("Payment done using: "+upi);
		return this;
	}
	
	public ShoppingCart generateOrder(){
		System.out.println("Order id is 12345");
		return this;
	}
	
	public ShoppingCart logOut(){
		System.out.println("Log out done");
		return this;
	}
	
	
	
	

}
