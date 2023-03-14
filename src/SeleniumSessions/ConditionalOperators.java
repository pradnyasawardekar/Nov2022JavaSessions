package SeleniumSessions;

public class ConditionalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=100;
		int j=20;
		
		if(i==j){
			System.out.println("equal");
		}
		else{
			System.out.println("not equal");//dis
		}
		
		if(j>=i){
			System.out.println("j is greater than i");
		}
		else{
			System.out.println("i is greater than j");//dis
		}
		
		//> >= < <= == !=
		
		int total=100;
		if(total==100){
			System.out.println("Bye");//bye
		}
		else{
			System.out.println("Hi");
		}
			
		
		////////////////////////////////////
		//nested if
		int marks=98;
		if(marks<=100){
			System.out.println("valid marks");
			if(marks>=95){
				System.out.println("A grade");
				
				if(marks>=95){
					System.out.println("eligible for scholarship");
					
					if(marks==100){
						System.out.println("100% fees waived off");
					}
				}
					
				
			}
			if(marks<=80){
				System.out.println("B grade");
			}
		}
		else{
			System.out.println("invalid marks");
		}
		
		
		//////////////////////////////////////////////
		
		//if-elseif
		String browser="ie";
		if(browser.equals("firefox")){
			System.out.println("ff launched");
		}
		else if(browser.equals("chrome")){
			System.out.println("chrome is launche");
		}
		else if(browser.equals("safari")){
			System.out.println("Safari is launched");
		}
		else if(browser.equals("edge")){
			System.out.println("edge is launched");
		}
		else{
			System.out.println("invalid browser");
		}
		
	
	}

}
