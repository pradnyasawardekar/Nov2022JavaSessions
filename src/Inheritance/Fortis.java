package Inheritance;

public class Fortis extends Hospital{
	
	@Override
	public void surgery(){
		System.out.println("General surgery---- Fortis");
	}
	
	@Override
	public void bookAppointment(){
		System.out.println("Book Appointment----- Fortis");
	}

	public void eyesSurgery(){
		System.out.println("Eyes Surgery---- Fortis");
	}
	
	
}
