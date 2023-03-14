package SeleniumSessions;

public class DataTypesConcept {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//byte
		// size:- 1 byte=8 bits
		//range:- -128 to 127
		byte age= 25; 
		System.out.println(age);   //25
		

		//short
		// size:- 2 bytes	
		// range:- -32768 to 32767
		short sh=500;		
		System.out.println(sh);  //500
		
		
		//int
		//size:- 4 bytes
		//range:- -2147483648 to 2147483647
		int i=100000;		
		System.out.println(i);  //100000
		System.out.println(i+age);   //100025
		
		
		//long
		//size:- 4 bytes
		//range:- 
		long l=2342342l;	
		System.out.println(l);   //23423421
		
		//float
		//size:- 4 bytes
		//range:- upto 7 digits after decimal
		float f1=12.33f;		
		System.out.println(f1);   //12.33
		
		float f2= (float) 23.44;
		System.out.println(f2);   //23.44
		
		float f3=100;
		System.out.println(f3);   //100.0
		
		
		//double
		//size:-8 bytes
		//range:- upto 16 digits after decimal
		double d=12.123456789101112;  
		double d1=200;
		System.out.println(d1);   //200.0
		
		
		//char
		//size:- 2 bytes
		//range:- A-Z, a-z,0-9,special chars, etc, etc
		char c1='a';		//ASCII 97
		char c11='b';		//ASCII 98
		char c3='Z';		
		char c4='$';
		
		System.out.println(c1);		//a
		System.out.println(c1+c11);	//195(97+98)ASCII
		System.out.println(c11-c1);	//1(98-97)ASCII
		
		char c2='0';		//48  ASCII
		char c22='9';		//57  ASCII
		System.out.println(c2+c22);		//105
		System.out.println(c2);	//0 value of char c2
		System.out.println((int)c2); //48
		
		System.out.println(c1+""+c11);   //ab
		
		System.out.println((int)c1);  //97
		System.out.println(c1+9);  //97+9=106
		System.out.println(c22+9);  //57+9=66
		System.out.println(c1+'9');  //97+57=154
		
		
		
		//boolean
		//size:- ~ 1 bit
		//range:- true, false
		boolean flag=true;		
		System.out.println(flag);   //true
		
		System.out.println(100);		//100
		System.out.println(100+100);	//200
		System.out.println('1'+'1');	//49+49=98
		System.out.println('a'+'b');	//97+98=195
		
				
	}

}
