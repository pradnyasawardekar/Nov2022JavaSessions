package SeleniumSessions;

public class Employee {
	
	//class:category of objects/blueprint/template
	//object: physical entity
	//eg.  Employee is a class n emp1 is a physical employee	
	
	//class variables:
	String name;
	int age;
	String city;
	double salary;
	
	
	public static void main(String[] args) {
		
	//create an object of the class
	//using new keyword
		Employee e1=new Employee();
	//	Class obj_ref_name= Object
	//e1 is of data type Employee
	
	//assign the values to an object
		e1.name="Ravi";
		e1.age=25;
		e1.city="Pune";
		e1.salary=12.33;
		
	//print
	//	System.out.println(e1);   //SeleniumSessions.Employee@15db9742
		
		
		Employee e2= new Employee();
	//if no values are assigned den it will tk default values
	//	System.out.println(e2.name+" "+e2.age+" "+e2.city+" "+e2.salary);
		
	//assign values
		e2.name="Anjali";
		e2.age=35;
		e2.city="Goa";
		e2.salary=25.33;
		
		
		Employee e3= new Employee();
		//e3=null;			//null refrence object   		null pointer exception
		//e3.name="Kareem";		//null pointer exception
		
		e3.name="Kareem";
		e3.age=43;
		e3.city="LA";
		e3.salary=66.33;
		
		System.out.println(e1.name+" "+e1.age+" "+e1.city+" "+e1.salary);
		System.out.println(e2.name+" "+e2.age+" "+e2.city+" "+e2.salary);
		System.out.println(e3.name+" "+e3.age+" "+e3.city+" "+e3.salary);
		
		
		
	//object without references-->bad way of programming
//		new Employee();
//		new Employee().name="Naveen";
		
		e1=e2;
		System.out.println("______________________");
		System.out.println(e1.name+" "+e1.age+" "+e1.city+" "+e1.salary);
		System.out.println(e2.name+" "+e2.age+" "+e2.city+" "+e2.salary);
		System.out.println(e3.name+" "+e3.age+" "+e3.city+" "+e3.salary);
		
		e2=e3;
		System.out.println("______________________");
		System.out.println(e1.name+" "+e1.age+" "+e1.city+" "+e1.salary);
		System.out.println(e2.name+" "+e2.age+" "+e2.city+" "+e2.salary);
		System.out.println(e3.name+" "+e3.age+" "+e3.city+" "+e3.salary);
		
		e3=e1;
		System.out.println("______________________");
		System.out.println(e1.name+" "+e1.age+" "+e1.city+" "+e1.salary);
		System.out.println(e2.name+" "+e2.age+" "+e2.city+" "+e2.salary);
		System.out.println(e3.name+" "+e3.age+" "+e3.city+" "+e3.salary);
		
		
		
		
		
		
		
		
		
		
		System.gc();
		

	}

}
