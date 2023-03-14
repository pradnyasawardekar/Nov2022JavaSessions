package Inheritance;

public class Apollo extends Hospital{
	
	public static void admission(){
		System.out.println("Admission------- Apollo");
	}
	
	
	@Override
	public void surgery(){
		System.out.println("General surgery---- Apollo");
	}

	@Override
	public void bookAppointment(){
		System.out.println("Book Appointment----- Apollo");
	}

	public void emergencyServices(){
		System.out.println("Emergency Services---- Apollo");
	}
	

}
