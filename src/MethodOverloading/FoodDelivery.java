package MethodOverloading;

public class FoodDelivery {
	
	String usernm;
	private String pwd;
	private int otp;
	String phone;
	
	
	public boolean logIn(String phone, String pwd){
		System.out.println("The user has logged in with phone no.: "+this.phone);
		return true;
	}
	
	
	public boolean logIn(String phone, int otp){
		System.out.println("The user has logged in with phone no.: "+this.phone);
		return true;
	}
	
	
	
	public boolean logIn(String usernm, String pwd, int otp){
		System.out.println("The user has logged in with phone no.: "+this.phone);
		return true;
	}
	
	
	public FoodDelivery(String usernm, String pwd, String phone, int otp){
			
		this.usernm=usernm;
		this.pwd=pwd;
		this.phone=phone;
		this.otp=otp;
				
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		
		String usernm="foodie";
		String pwd="pass";
		int otp=123;
		String phone="9876543210";
		
		FoodDelivery fd= new FoodDelivery(usernm,pwd,phone,otp);
		
		fd.logIn(phone, pwd);
		fd.logIn(phone, otp);
		fd.logIn(usernm, pwd);
		fd.logIn(usernm, pwd, otp);
		
		
	}

}
