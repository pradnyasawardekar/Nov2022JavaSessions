package SeleniumSessions;

import javax.swing.plaf.synth.SynthStyle;

public class MathOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(10/2);//5
		System.out.println(9/2);//4.5-->4
		
		System.out.println(9.0/2);//4.5
		System.out.println(9/2.0);//4.5
		System.out.println(9.0/2.0);//4.5
		
		//System.out.println(9/0);// Arithmetic Exception
		System.out.println(0/9);//0
		
		System.out.println(9.0/0);//infinity
		System.out.println(9/0.0);//infinity
		System.out.println(9.0/0.0);//infinity
		
	//	System.out.println(0/0);// Arithmetic Exception
		System.out.println(0.0/0);//NaN(Not a Number)
		System.out.println(0/0.0);//NaN(Not a Number)
		System.out.println(0.0/0.0);//NaN(Not a Number)
		
		System.out.println(10%2);//0 mod operator
		System.out.println(9%2);//1
		System.out.println(9.2%2);//1.1999999999999993
		

	}

}
