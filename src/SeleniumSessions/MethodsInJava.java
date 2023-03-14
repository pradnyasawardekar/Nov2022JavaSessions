
package SeleniumSessions;

public class MethodsInJava {
	
	// data members
	// 1. class vars
	//2.class methods
	
	//functions:
	//functions r independent
	//cannot create a function inside a function
	
	//1. no input no return
	//return type: void
	public void test(){
		System.out.println("No input no output function");
	}
	
	
	//2. no input some return
	
	//return type:int
	public int sum(){
		System.out.println("in sum function");
		int a=10, b=20;
		int sum=a+b;
		return sum;
	}
	
	//return String
	public String empName(){
		System.out.println("in empName function");
		String name="Naveen";
		return "Hi"+name;
	}
	
	//3. some input some return
	//parameters/arguments
	public int getMultiplication(int i, int j){
		System.out.println("in getMul function");
		int mul=i*j;
		return mul;
	}
	
	
	//4. some input no return
	public void sub(int p, int q){
		int sub=p-q;
		System.out.println("in sub function: "+sub);

		}
	
//////////////////////////////////////////////////
//launch browser function

	public boolean launchBrowserSwitch(String browser){
		boolean flag=true;
		
		System.out.println("Launching browser in progres......");
		
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("Chrome is launched");
			break;
						
		case "firefox":
			System.out.println("Firefox is launched");
			break;
					
		case "safari":
			System.out.println("Safari is launched");
			break;
						
		case "ie":
			System.out.println("IE is launched");
			break;
			
		default:
			System.out.println("Invalid browser name");
			flag=false;
		}
		
		return flag;


	}
	
	
	
	public boolean launchBrowserIf(String browser){
		boolean flag=true;
		
		System.out.println("Launching browser in progres......");
		
		if(browser.toLowerCase().trim().equals("chrome")){
			System.out.println("Chrome is launched");
		}
		
		else if(browser.toLowerCase().trim().equals("firefox")){
			System.out.println("Firefox is launched");
		}
		
		else if(browser.toLowerCase().trim().equals("safari")){
			System.out.println("Safari is launched");
		}
		
		else if(browser.toLowerCase().trim().equals("ie")){
			System.out.println("IE is launched");
		}
		else{
			flag=false;
			System.out.println("Invalid browser name");
		}
		
		return flag;
		
	}
		
	
	
//main
	public static void main(String[] args) {

			//test, sum, empName, getMultiplication, sub
		MethodsInJava obj= new MethodsInJava();
		
		obj.test();
		
		//int sum= obj.sum();
		System.out.println("Sum is: " +obj.sum());
		
		int mul= obj.getMultiplication(3, 5);	//call by value(when u provide input arguments/parameters)
		System.out.println("Product is: "+mul);
				
		String str=obj.empName();
		System.out.println("Employee said: "+str);
		
		obj.sub(30, 8);//call by value
				
		
		
		
//////////////////////////////////////
		//browser launch logic
		String browser="chrome";
		
		obj.launchBrowserSwitch(browser);
		
		
		obj.launchBrowserIf(browser);
		
		
		
	}


}
