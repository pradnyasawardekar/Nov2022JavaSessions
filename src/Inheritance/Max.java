package Inheritance;

public class Max extends Hospital{
	
	@Override
	public void surgery(){
		System.out.println("General surgery---- Max");
	}
	
	@Override
	public void bookAppointment(){
		System.out.println("Book Appointment----- Max");
	}

	public void insuranceClaim(){
		System.out.println("Insurance Claim---- Max");
	}

}
