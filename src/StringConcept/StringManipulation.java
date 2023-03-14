package StringConcept;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {

		String str= "   Hi this is my Java code and i am so happy    ";
		
		System.out.println(str);
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(10));
		
		System.out.println(str.indexOf("is"));
		
		System.out.println(str.toLowerCase());
		
		System.out.println(str.toUpperCase());
		
		System.out.println(str.trim());
		
		System.out.println(str.replace('h', 'H'));
		
		System.out.println(str.contains("Java"));
		
		String lang= "JAVA_PYTHON_RUBY_DOTNET";
		String newLang[]= lang.split("_");
		System.out.println(Arrays.toString(newLang));
		
		
		

		String st = "i am naveen hi this is my java code and i am so happy i am learning";
		int c = 0;
		while(c<st.length()) {
			  if(st.charAt(c) == 'i') {
				System.out.println(st.indexOf('i', c));
			}
			c++;
		}
		
		
		
		for( int cnt = 0; cnt< st.length(); cnt++){
			if(st.charAt(cnt) == 'i'){
				System.out.println(st.indexOf('i', cnt));
			}
		}
		
		
	}

}
