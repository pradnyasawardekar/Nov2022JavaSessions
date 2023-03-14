package Oops_Constructor;

import java.util.Arrays;

public class AssgnTestBrowser {

	public static void main(String[] args) {
		
		String defBrowser="chrome";
		double defVersion= 3.2;
		String[] defPlugIn=  {"new","Plugin","2022"};
		
		
//call contructor
		AssgnBrowser br= new AssgnBrowser(defBrowser, defVersion, defPlugIn);
		
		System.out.println("The object values are:");
		System.out.println("Browser :"+br.name+"  "+"  Version :"+br.version+"  "+"  Plugin :"+Arrays.toString(br.plugin));
		
		String newBrowser="IE";
		double newVersion= 4.2;
		String[] newPlugIn=  {"latest","Plugin","2022"};
		
		System.out.println("Update in progress...");
	
//call setters to update
		br.setName(newBrowser);
		br.setVersion(newVersion);
		br.setPlugin(newPlugIn);
		
//call getters to print
		System.out.println("The updated values are:");
		System.out.println("Browser :"+br.getName()+"  "+"  Version :"+br.getVersion()+"  "+"  Plugin :"+Arrays.toString(br.getPlugin()));
		
		

	}

}
