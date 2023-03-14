package SeleniumSessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {


		String browser="firefox";
		
		switch (browser) {
		case "chrome":
			System.out.println("Chrome is launched");
			break;
		case "safari":
			System.out.println("Safari is launched");
			break;
		case "firefox":
			System.out.println("Firefox is launched");
			break;
	
		default:
			System.out.println("invalid browser");
			break;
			
		case "edge":
			System.out.println("Edge is launched");
			break;	
			
		}
		//////////////////////////////////////
		
		int marks=90;
		switch (marks) {
		case 90:
			System.out.println("Grade A");
			break;
		case 80:
			System.out.println("Grade B");
			break;
		case 70:
			System.out.println("Grade C");
			break;

		default:
			System.out.println("Fail");
			break;
		}
		
		////////////////////
		//with char
		
		char ch='z';
		switch (ch) {
		case 'a':
			System.out.println("Vowel");
			break;
		case 'e':
			System.out.println("Vowel");
			break;
		case 'i':
			System.out.println("Vowel");
			break;
		case 'o':
			System.out.println("Vowel");
			break;
		case 'u':
			System.out.println("Vowel");
			break;
			

		default:
			System.out.println("not a vowel");
			break;
		}
		

	}

}
