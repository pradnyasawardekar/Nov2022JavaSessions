package SeleniumSessions;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x="Hello";
		String y="World";
		
		int a=100;
		int b=200;
		
		System.out.println(x+y);//HelloWorld
		System.out.println(a+b);//300
		
		System.out.println(x+a);//Hello100
		System.out.println(a+b+x+y);  //300HelloWorld     left to right---addition first n den contenation
		System.out.println(x+y+a+b); //HelloWorld100200
		System.out.println(x+y+(a+b)); //HelloWorld300
		System.out.println(a+b+x+y+a+b); //300HelloWorld100200
		
		
		System.out.println(1200); //1200
		
		double d1=12.33;
		double d2=23.44;
		System.out.println(x+y+d1+d2);//HelloWorld12.3323.44
		
		System.out.println("The value of a :"+a);//The value of a :100
		System.out.println("The value of b :"+b);//The value of b :200
		System.out.println("The value of a+b :"+(a+b));//The value of a+b :300
		
		
		String ph="987654321";
		String ac="98";
		int pp= Integer.parseInt(ac)+1;
		System.out.println(pp); //99
	}

}
