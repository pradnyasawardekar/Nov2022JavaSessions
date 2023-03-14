package DataConversion;

public class WrapperClassConcept {

	public static void main(String[] args) {

		String x = "100";
		
		System.out.println(x+20);		//10020
		
		//String to int
		int i = Integer.parseInt(x);
		System.out.println(x+20);		//120
		
		String y = "100USD";
		System.out.println(y+20);		//100USD20
		
		String curr[] = y.split("USD");
		System.out.println(curr[0]);	//100->String
		
		int j = Integer.parseInt(curr[0]);
		System.out.println(j+20);		//120
		
		
		
		//String to double
		String z = "12.33";
		
		Double d = Double.parseDouble(z);
		System.out.println(d+20);		//32.33
		
		
		//String to Boolean
		String headless="true";
		if(Boolean.parseBoolean(headless)){
			System.out.println("Run in headless");
		}
		
		
		//int To String
		int k=100;
		String k1 = String.valueOf(k);
		System.out.println(k1+20);		//10020
		
		//Boolean to String
		boolean flag=true;
		String f = String.valueOf(flag);
		
		// min and max values of all data types
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);

		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		
	}

}
