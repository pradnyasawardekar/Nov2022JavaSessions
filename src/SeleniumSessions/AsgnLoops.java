package SeleniumSessions;

public class AsgnLoops {

	public static void main(String[] args) {
		
		for(int i=1; i<=9;i++){
		//	System.out.println();
			System.out.println("I am Batman "+i);
		}
			
	// 10 to 1 using for, while and do-while loop

		//for
		System.out.println("For loop 10-1");
		for(int j=10; j>=1; j--){
			System.out.println(j);
		}
		
		//while
		System.out.println("while loop 10-1");
		int k=10;
		while(k>=1){
			System.out.println(k);
			k--;
		}
			
		//do-while
		System.out.println("Do-while loop 10-1");
		int l=10;
		do{
			System.out.println(l);
			l--;
			}
		while(l>=1);
			
	
//print "Hello World" ten times using while loop
		System.out.println("print Hello World ten times using while loop");
		int count=1;
		while(count<=10){
			System.out.println("Hello World");
			count++;
		}
		
//print 1 to 10 using while loop
		System.out.println("print 1 to 10 using while loop");
		int counter=1;
		while(counter<=10){
			System.out.println(counter);
			counter++;
		}

//find out the max number from the given three different positive numbers.
		System.out.println("Greatest num");
		int num1=25;
		int num2=78;
		int num3=87;
		
		if((num1> num2) &&(num1>num3)){
			System.out.println(num1+  " is greatest amongst "+num1+" "+num2+" "+num3);
		}
		else if((num2> num1) &&(num2>num3)){
			System.out.println(num2+ " is greatest amongst "+num1+" "+num2+" "+num3);
		}
		else{
			System.out.println(num3+ " is greatest amongst "+num1+" "+num2+" "+num3);
		}
//odd and even numbers between 1 to 100
		System.out.println("odd and even numbers between 1 to 100");
		
		System.out.println("Odd numbers");
		
		for(int cnt=1;cnt<=100;cnt=cnt+2){
			System.out.println(cnt);
		}
		
		
		System.out.println("Even numbers");

		for(int cnt=2;cnt<=100;cnt=cnt+2){
			System.out.println(cnt);
		}
		
// A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while and for loop.		
		System.out.println(" A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while and for loop.");

		//while loop
		System.out.println("using while loop");
		System.out.println("ASCII: char");
		char ch1='A';
		while(ch1<='Z'){
			System.out.println((int)ch1+"   :   "+ch1);
			ch1++;
		}
		
		System.out.println("ASCII: char");
		char ch2='a';
		while(ch2<='z'){
			System.out.println((int)ch2+"   :   "+ch2);
			ch2++;
		}
		
		System.out.println("ASCII: char");
		char ch3='0';
		while(ch3<='9'){
			System.out.println((int)ch3+"   :   "+ch3);
			ch3++;
		}
		
		//for loop
		System.out.println("using for loop");
		System.out.println("ASCII: char");
		for(char c1='A';c1<='Z';c1++){
			System.out.println((int)c1+"   :   "+c1);
		}
		
		System.out.println("ASCII: char");
		for(char c2='a';c2<='z';c2++){
			System.out.println((int)c2+"   :   "+c2);
		}
		
		
		System.out.println("ASCII: char");
		for(char c3='0';c3<='9';c3++){
			System.out.println((int)c3+"   :   "+c3);
		}
		
		
// 1.0 2.0 3.0  ...... 10.0 
		System.out.println("Print 1.0 2.0 3.0  ...... 10.0");
		for(float f=1.0f; f<=10;f++){
			System.out.print(f +" ");
		}

// 0 5 10 15 20 25 …. 100
		System.out.println();
		System.out.println("Print series 0 5 10 15 20 25 …. 100");
		for(int ser=0; ser<=100;ser++){
			if(ser%5==0){
				System.out.print(ser+" ");
			}
		}
		
		
//Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.
	//for loop
		System.out.println("for loop vowels");
		for(char v1='a'; v1<='z';v1++){
			switch (v1) {
			case 'a':
				System.out.println(v1+" is a vowel");
				break;
			case 'e':
				System.out.println(v1+" is a vowel");
				break;
			case 'i':
				System.out.println(v1+" is a vowel");
				break;
			case 'o':
				System.out.println(v1+" is a vowel");
				break;
			case 'u':
				System.out.println(v1+" is a vowel");
				break;
			default:
				//System.out.println(v1+" is a consonant");
				break;
			}
		}
		
		//while loop
		System.out.println("while loop vowels");
		char v2='a';
		while(v2<='z'){
			switch (v2) {
			case 'a':
				System.out.println(v2+" is a vowel");
				break;
			case 'e':
				System.out.println(v2+" is a vowel");
				break;
			case 'i':
				System.out.println(v2+" is a vowel");
				break;
			case 'o':
				System.out.println(v2+" is a vowel");
				break;
			case 'u':
				System.out.println(v2+" is a vowel");
				break;
			default:
				//System.out.println(v1+" is a consonant");
				break;
			
			}
			v2++;
		}
		
// Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".		
			
		System.out.println("multiples of 7");
		for(int m=1;m<=10;m++){
			if(m%7==0){
				System.out.println("bye, see you tomorrow");
				break;
			}
			else{
				System.out.println(m);
			}
		}
		
		
//cricket score card system using for and while loops
		System.out.println("cricket score card system using for and while loops:");
		
		//for loop
		System.out.println("for loop");
		for(int score=0;score<=100;score++){
			switch (score) {
			case 0:
				System.out.println("Zero - duck");
				break;
			case 25:
				System.out.println("good job");
				break;
			case 50:
				System.out.println("good job - half century");
				break;
			case 100:
				System.out.println("good job -  century");
				break;

			default:
				System.out.println("Score is: "+score);
				break;
			}
		}
		
		//while loop
		System.out.println("while loop");
		int score1=0;
		while(score1<=100){
			switch (score1) {
			case 0:
				System.out.println("Zero - duck");
				break;
			case 25:
				System.out.println("good job");
				break;
			case 50:
				System.out.println("good job - half century");
				break;
			case 100:
				System.out.println("good job -  century");
				break;

			default:
				System.out.println("Score is: "+score1);
				break;
			}
			score1++;
		}
		

//((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
		System.out.println("Sum of ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) is: "+(((25.5*3.5)-(3.5*3.5))/(40.5-4.5)));
		
		System.out.println("Hello Selenium "+'t');
		
		int var1=100;
		int var2=200;
		int var3=3400;
		System.out.println("Your Total amount is. "+(var1+var2+var3));
		
	//positive negative numbers
		System.out.println("positive negative numbers");
		int numb=-35;
		if(numb>0){
			System.out.println(numb+" is a Positive number");
		}
		else if(numb<0){
			System.out.println(numb+" is a Negative number");
		}
		else{
			System.out.println(numb +" is Zero");
		}
		
	
	
	
//    00 01 02 03 04 05 06 07 08 09 
//    10 11 12 13 14 15 16 17 18 19 /
//    20 21 22 23 24 25 26 27 28 29 
//    30 31 32 33 34 35 36 37 38 39
	
	
	System.out.println("_______________________");
	
	for(int row=0; row<=3; row++)
	{
		for(int col=0; col<=9; col++){
			System.out.print(row+""+col+" ");
		}
	
		System.out.println();
	}
	
	
	
	
	
	
	}
	

}
