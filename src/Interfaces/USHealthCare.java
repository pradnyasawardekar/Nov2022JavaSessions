package Interfaces;

public interface USHealthCare extends WHO, USHG{
	
	//In interface:-
		//cannot hv method body(abstract methods)
		// only method declaration/prototype(no business logic)
	
	//cannot create object of an interface
	//no constructors allowed(since no object is created)
	
	//abstract methods:-
		//final: NA
		//static: NA
		//private:NA
		//--->coz they are empty so its useless making them static, private or final
	
	//jdk 1.7:- 100% abstraction
	//jdk 1.8:- default non static methods ~= 100%
	//0% abstraction is also possible after jdk 1.8(by not mentioning any abstract methods)

	//vars: static and final by default
	int minfee=10;
		
	public void cardioServices();
	public void neuroServices();
	public void physioServices();
	public void emergencyServices();
	
	@Override
	public void covidVaccination();
	
	
	
//AFter jdk 1.8:-   static n default
	//1. static methods with method body:
		//called by using interface name
	public static void taxCalculation(){
		System.out.println("USHealthCare--->taxCalcServices");
	}
	
	//2. default methods: not static
		//called by using object name
	default void getMedicalServices(){
		System.out.println("USHealthCare--->getMedicalServices");
	}
	
	
}
