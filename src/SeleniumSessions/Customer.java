package SeleniumSessions;

import java.util.Arrays;

public class Customer {
	
	public String[] getCustDevices(String custName){
		
		String[] devices= null;
		
		if(custName.equals("Ravi")){
			devices= new String[] {"MacBook", "iphone", "ipad"};
			return devices;
		}
		
		else if(custName.equals("Rashmi")){
			devices=new String[] {"Dell", "Samsung S10", "chromebook"};
			return devices;
		}
		else if(custName.equals("Naveen")){
			devices=new String[] {"AcerLaptop", "Nokia", "SIM card"};
			return devices;
		}
		else{
			System.out.println("Employee name not found");
			return devices;
		}
		
	}
	
	
	public String[] getDevicesSwitch(String custName){
		
		String[] devices= null;
		
		switch (custName) {
		case "Ravi":
			devices= new String[] {"MacBook", "iphone", "ipad"};
			return devices;
			//break;
		
		case "Rashmi":
			devices=new String[] {"Dell", "Samsung S10", "chromebook"};
			return devices;
			//break;
			
		case "Naveen":
			 devices=new String[] {"AcerLaptop", "Nokia", "SIM card"};
			return devices;
			//break;

		default:
			//String[] devices[]=null;
			return devices;
			//break;
		}	
		
	}
	
	
	
	

	public static void main(String[] args) {
		
		String custName="Rashmi";
		
		Customer obj=new Customer();
		
		String[] fetchedDevices=obj.getCustDevices(custName);
		
		System.out.println(custName+" has following devices: "+Arrays.toString(fetchedDevices));
		
		

		String[] fetchedDevices1=obj.getDevicesSwitch("Ravi");
		
		System.out.println("Ravi has following devices: "+Arrays.toString(fetchedDevices1));
		
		

	}

}
