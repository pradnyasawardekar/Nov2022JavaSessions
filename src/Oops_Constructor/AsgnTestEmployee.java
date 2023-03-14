package Oops_Constructor;

import java.util.Arrays;

public class AsgnTestEmployee {

	public static void main(String[] args) {
		
		AsgnEmployee emp= new AsgnEmployee();
//call setters to set the value		
		emp.setName("Naveen");
		emp.setAge(25);
		emp.setSalary(12.33);
		emp.setActive(true);
		emp.setGender('M');
		
		
//call getinfo function		
		Object getInfo[]= new Object[5];
		
		getInfo = emp.getEmployeeInfo();
		
//print info		
		System.out.println("The employee details are: "+ Arrays.toString(getInfo));
		
		
//_________________________________________________________Encapsulation	
		
//testing encapsulation
		
	//private member accessing from main is not possible	
		//System.out.println("Testing encapsulation: value of name accessing from main: "+emp.name);

	//using getter
		System.out.println("Testing encapsulation: value of name is: "+emp.getName());
		
//set new name
		emp.setName("Pradnya");
		
	//using method
		System.out.println("Testing encapsulation: value of name is: "+emp.testEncapsulation());
		
		
		
	}

}
