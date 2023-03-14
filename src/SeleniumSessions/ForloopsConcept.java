package SeleniumSessions;

public class ForloopsConcept {

	public static void main(String[] args) {
		
		//simple for loop
		for(int i=0; i<=5;i++){
			System.out.println(i);
		}
		
		//another format of for loop
		int j=1;
		for(;j<=5;){
			System.out.println(j);
			j++;
		}
		
		
		//infinite loop
//		for(;;){
//			System.out.println("Bye");
//			//break;
//		}
		
		
//		for(;true;){
//			System.out.println("Bye");
//		}
		//below this any code would be unreachable code
		
	/////////////////
		//5 to 50
		for(int k=5; k<=50;k++){
			System.out.println(k);
			if(k % 5 == 0){
				System.out.println("mod of 5");
				//break;		//--->dis break will break d entire loop
			}
		}
			
		//////////////////
		System.out.println("_________________");
			//print a to z
		
		//using char in for loop
			for(char c='a';c<='z';c++){
				
				System.out.println((int)c+" ASCII is char--> "+c);
				
				
			}
		/////////////////
			
		//using byte in for loop
			for(byte b=1;b<=5;b++){
				System.out.println("Byte: "+b);
			}
			
		//using double
			for(double d=1.1; d<=10; d++){
				System.out.println("Double: "+d);
			}
				
		//using String
			for(String s="Naveen"; s.equals("Naveen");){
				System.out.println("String Hi: "+s);
				break;
			}
			
		
			
		
		
		
		

	}

}
