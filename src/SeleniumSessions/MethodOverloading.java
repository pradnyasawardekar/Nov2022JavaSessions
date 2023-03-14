package SeleniumSessions;

import java.util.Arrays;

public class MethodOverloading {
	
	
	static int staticVarTest=10;	//this variable is called in Car class
	
	
	public void test(){
		
		System.out.println("In zero parameter method");
		
	}
	
	public void test(int x){

		System.out.println("In int parameter method: "+x);
			
	}
	
	public void test(String x){

		System.out.println("In String parameter method: "+x);
				
	}
	
	
	
	

	public static void main(String[] args) {
		
		
		MethodOverloading obj= new MethodOverloading();
		
		obj.test();
		
		obj.test(12);
		
		obj.test("Hello");
		
//calling other main function		
		obj.main(10);
		
//printing main function args argument		
		System.out.println(Arrays.toString(args));
		
		
	}
	
//overloading main function	
	public static void main(int j) {
		
		System.out.println("In other main function");
		
	}


}
