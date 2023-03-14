package Interfaces;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fh= new FortisHospital();
		System.out.println("value from fortis: "+fh.minfee);		//value from fortis
		System.out.println("value from USHealthCare: "+USHealthCare.minfee);	//value from USHealthCare
		//System.out.println("value from fortis: "+FortisHospital.minfee);		//value from Interface, will work if its not method hidden
		
	//US
		fh.cardioServices();
		fh.physioServices();
		fh.neuroServices();
		fh.covidVaccination();
		
	//UK
		fh.entServices();
		fh.dentalServices();
			
	//India
		fh.oncoServices();
		fh.gynichServices();
		fh.orthoServices();

	//common
		fh.emergencyServices();		//hospital
		
	//individual
		fh.medicalTraining();
		fh.medicalInsurance();
		
	//static method and default method
		USHealthCare.taxCalculation();		//Refereed using interface name as its static
		fh.getMedicalServices();	//Refereed using object since its non static
		
//Not allowed to create an object of an interface		
	//USHealthCare us= new USHealthCare();	
	
		
//top casting in interfaces:
		//child class object is referred by parent interface
		//every fortis hospital comes under USHealthCare---?
		USHealthCare us= new FortisHospital();
		
		us.cardioServices();
		us.neuroServices();
		us.physioServices();
		us.emergencyServices();
		us.covidVaccination();
		
		USHealthCare.taxCalculation();		//static
		us.getMedicalServices(); 		//default
		
		
	//UK
		UKHealthCare uk= new FortisHospital();
		uk.entServices();
		uk.dentalServices();
		uk.emergencyServices();
		uk.covidVaccination();
		
	//India
		IndiaHealthCare in= new FortisHospital();
		in.oncoServices();
		in.gynichServices();
		in.orthoServices();
		in.emergencyServices();
		in.covidVaccination();
		
		
//down casting in interfaces
		//at compile time?
		//FortisHospital fh1 = new USMedical();
		
		//use constants:-
		System.out.println("DEFAULT_TIME_OUT: "+Constants.DEFAULT_TIME_OUT);
		System.out.println("DEFAULT_PAGE_LOAD_TIME_OUT: "+Constants.DEFAULT_PAGE_LOAD_TIME_OUT);
		System.out.println("OK_MSG_200: "+Constants.OK_MSG_200);
		
	}

}
