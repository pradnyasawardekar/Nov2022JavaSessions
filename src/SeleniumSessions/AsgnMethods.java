package SeleniumSessions;

public class AsgnMethods {
	
//print the sum of two numbers
public int sum(int x, int y){
	int sum = x+y;
	return sum;
}

public int prod(int x,int y){
	int prod = x*y;
	return prod;
}

//print circumference n area of a circle of radius entered by user 
public void circum(int radius){
	
	float circumference=(float) (2*3.14*radius);
	System.out.println("The radius of circle is: "+radius);
	System.out.println("The circumference of circle is: "+circumference);
		
}

public void areaOfCircle(int radius){
	
	double area = (3.14*radius*radius);
	System.out.println("The radius of circle is: "+radius);
	System.out.println("The area of circle is: "+area);
}


//max of 3
public int maxNum(int n1, int n2, int n3){
	int max=-1;
	
	if((n1>n2)&&(n1>n3))
		max=n1;
	else if((n2>n3)&&(n2>n1))
		max=n2;
	else
		max=n3;
	
	return max;	
}


//min of 3
public int minNum(int n1, int n2, int n3){
	int min=-1;
	
	if((n1<n2)&&(n1<n3))
		min=n1;
	else if((n2<n3)&&(n2<n1))
		min=n2;
	else
		min=n3;
	
	return min;	
}

// even or odd
public void evenOdd(int num){
	
	if (num%2 == 0)
		System.out.println(num+" is even number.");
	else
		System.out.println(num+" is odd number.");
	
}

//Eligible to vote or not
public void voteElg(int age){
	if(age>=18){
		System.out.println("Age is "+age+" so the person can vote");
	}
	else{
		System.out.println("Age is "+age+" so the person CANNOT vote");
	}
}


	public static void main(String[] args) {

		AsgnMethods obj= new AsgnMethods();
		
		int n1=20;
		int n2=5;
		int n3=45;
		
		int sum = obj.sum(n1, n2);
		System.out.println("Sum of "+n1+" and "+n2+" is: "+sum);
		
		int prod = obj.prod(n1, n2);
		System.out.println("Prod of "+n1+" and "+n2+" is: "+prod);
		
		obj.circum(n2);
		obj.areaOfCircle(n2);
		
		int max= obj.maxNum(n1, n2, n3);
		System.out.println("Max amongst "+n1+" , "+n2+" and "+n3+" is: "+max);
		
		System.out.println("Max amongst "+n1+" , "+n2+" and "+n3+" is: "+obj.minNum(n1, n2, n3));
		
		obj.evenOdd(n2);
		
		obj.voteElg(n3);
		obj.voteElg(n2);
		
		
	}

}
