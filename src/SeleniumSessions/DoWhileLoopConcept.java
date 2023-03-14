package SeleniumSessions;

public class DoWhileLoopConcept {

	public static void main(String[] args) {
		
		int p=1;
		do{
			p++;
			System.out.println(p);
		}
		while(p<=10);
		//output: 2 to 11
	/////////////////////////////	
		int x=1;
		do{
			x++;
			System.out.println(x);
			x++;
		}
		while(x<=10);
		//Output: even numbers.. 2 4 6 8 10
	////////////////////////////
		int y=1;
		do{
			System.out.println(y);
			y++;
		}
		while(y>=10);
		// Output: 1
	////////////////////
		
		int z=1;
		do{
			System.out.println(z);
			if(z==10){
				break;
			}
			z++;
		}
		while(z<=50);
		//Output: 1 to 10
		
	/////////////////
		
		
		
		
		
		
		
		
		
		

	}

}
