package Inheritance;

public class TestHospital {

	public static void main(String[] args) {
		
		Hospital h =new Hospital();
		h.admission();
		h.bookAppointment();
		Hospital.discharge();
		h.surgery();
		
		System.out.println("__________________________");
		
		Apollo a= new Apollo();
		a.bookAppointment();	//override	A
		a.surgery();			//override	A
		Apollo.admission();			//method hiding A
		a.emergencyServices();  //individual	A
		Apollo.discharge();		//static inherited from H
		
		
		
		
		System.out.println("__________________________");
		
		
		Hospital h1= new Max();		//up casting
		h1.admission();				//H
		h1.bookAppointment();		//M
		h1.discharge();				//H
		h1.surgery();				//M
		//h1.insuranceClaim();		// not allowed...individual function
		
		
		System.out.println("__________________________");
		
		//down casting
		//Max m= new Hospital();  not allowed
		Max m= (Max) new Hospital();	//run time exception ClassCastException
		
		
		
		
		

	}

}
