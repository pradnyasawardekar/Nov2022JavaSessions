package StringConcept;

public class StringReverse {
	
	public void reverseString(String str){
		
		String revStr="";
		
		for(int i= (str.length()-1); i>=0; i--){
			
			revStr= revStr + str.charAt(i);
			
		}
			
		System.out.println("The reverse of the String:"+str+" is :"+ revStr);
		
	}
	

	public static void main(String[] args) {
		
		StringReverse s = new StringReverse();
		
		s.reverseString("Pradnya");

		s.reverseString("Hello World!!");
		
		s.reverseString("this is my code 00123");
		
		
	}

}
