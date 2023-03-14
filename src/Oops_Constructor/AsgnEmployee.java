package Oops_Constructor;

public class AsgnEmployee {
	
	private String name;
	private int age;
	private double salary;
	private boolean isActive;
	private char gender;
	
//setter getters	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
//employee info
	public Object[] getEmployeeInfo(){
		
		Object obj[]= new Object[5];
		
		obj[0]= this.getName();
		obj[1]= this.getAge();
		obj[2]= this.getSalary();
		obj[3]= this.isActive();
		obj[4]= this.getGender();
		
		return obj;	
		
	}
	
	public String testEncapsulation(){
		System.out.println("Testing encapsulation: value of name inside the class method is: "+name);
		
		return name;
	}
	
	
	
	

}
