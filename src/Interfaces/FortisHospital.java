package Interfaces;

public class FortisHospital extends Hospital implements USHealthCare, UKHealthCare, IndiaHealthCare{

	//@Override		//-->NA as interface variables are static
	int minfee=20;		//not overriding but variable hiding as its static by default
	
//USHG	
	@Override
	public void childCareServices() {
		System.out.println("Fortis Hospital--- childCareServices");
	}


//WHO
		@Override
		public void covidVaccination() {
			System.out.println("Fortis Hospital--- covidVaccination");
		}

		
//India
	@Override
	public void oncoServices() {
		System.out.println("Fortis Hospital--- oncoServices");
		
	}

	@Override
	public void gynichServices() {
		System.out.println("Fortis Hospital--- gynichServices");
	}

	@Override
	public void orthoServices() {
		System.out.println("Fortis Hospital--- orthoServices");
		
	}

//UK	
	@Override
	public void entServices() {
		System.out.println("Fortis Hospital--- entServices");
		
	}

	@Override
	public void dentalServices() {
		System.out.println("Fortis Hospital--- dentalServices");
		
	}
	
//US
	@Override
	public void cardioServices() {
		System.out.println("Fortis Hospital--- cardioServices");
		
	}

	@Override
	public void neuroServices() {
		System.out.println("Fortis Hospital--- neuroServices");
		
	}

	@Override
	public void physioServices() {
		System.out.println("Fortis Hospital--- physioServices");
		
	}


//Common
//	@Override
//	public void emergencyServices() {
//		System.out.println("Fortis Hospital--- emergencyServices");
//	}

	
//Individual
	public void medicalTraining() {
		System.out.println("Fortis Hospital--- medicalTraining");
	}
	
	public void medicalInsurance() {
		System.out.println("Fortis Hospital--- medicalInsurance");
	}

	
	
	
}
