package SeleniumSessions;

public class PatterPrintAsgn {

	public static void main(String[] args) {

//*
//**
//***
//****
//*****
		
		for(int i=0;i<=4;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
			
//	*****	
//	****
//	***
//	**
//	*
		System.out.println("_________________________");
		
		int num=5;
		for(int i=1;i<=5;i++){
			
			for(int j=num;j>=1;j--){
				System.out.print("*");
			}
			num--;
			System.out.println();
		}
		
		
//		*
//	   **
//	  ***		
//	 ****	
//  *****
    
    System.out.println("_________________________"); 
    
    for(int i=0;i<=4;i++){
    	for(int j=4;j>=0;j--){
    		if(i<j)
    			System.out.print(" ");
    		else
    			System.out.print("*");
    	}
    		System.out.println();
    }
    
    System.out.println("_________________________"); 
    
//    *
//   ***
//  ***** 
// ******* 
//*********   
   
    int lines=5;
    int lineCounter=5;
    int row=1;
    for(int k=1; k<=lines;k++, lineCounter--, row++){
    	
    	for(int i=1;i<lineCounter;i++){
        	System.out.print(" ");
        }
    	
    	for(int j=1;j<=(2*row-1);j++){
    		System.out.print("*");
    	}
    	System.out.println();
    	//lineCounter--;
    	//row++;
    }
    
    System.out.println("_________________________"); 
    
//    1 
//    2 3 
//    4 5 6 
//    7 8 9 10 
//    11 12 13 14 15 
    
    int counter=1;
    for(int i=1; i<=5; i++){
    	for(int j=1;j<=i;j++){
    		System.out.print(counter+" ");
    		counter++;
    	}
    	System.out.println();
    }
    
 
	}
}
