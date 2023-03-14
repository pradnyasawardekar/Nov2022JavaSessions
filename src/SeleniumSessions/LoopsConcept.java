package SeleniumSessions;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. while loop
		
		//print 1 to 10
		int i=1;
		while(i<=10){
			System.out.println(i);
			i++;
		}
		
		//print even numbers
		int num=0;
		while(num<=10){
			System.out.println(num);
			num=num+2;
		}
		///////////////////////
	//using break stmt	
		System.out.println("_________________");
		//print hi on multiples of 5
		int p=1;
		while(p<=100){
			System.out.println(p);
			if(p%5==0){
				System.out.println("hi");
				break;
			}
			p++;
		}
		//1 2 3 4 5 hi
		
	////////////////////////
		int n=1;
		while(n<=5){
			System.out.println(n+" = Anjali");
			n++;
		}
//				1= Anjali
//				2= Anjali
//				3= Anjali
//				4= Anjali
//				5= Anjali
		
		/////////////////////
	//using break stmt
		int counter=100;
		while(counter>=100){
			System.out.println(counter);
			if(counter==200){
				System.out.println("bye");
				break;
			}
			counter++;
		}
		
		/////////////////////
		
		int score=0;
		while(score<=100){
				
//			System.out.println(score);
//			
//			if(score==25){
//				System.out.println("Score is 25...yaaayy");
//			}
//			if(score==50){
//				System.out.println("half century!!");
//			}
//			if(score==100){
//				System.out.println("century!!");
//			}
//			
//			score++;

			switch (score) {
			case 25:
				System.out.println("Score is 25...yaaayy");
				break;
			case 50:
				System.out.println("half century");
				break;
			case 100:
				System.out.println("Century");
				break;
			default:
				System.out.println(score);
				break;
			}
			
		score++;
		
		}
			
			
	}
}
