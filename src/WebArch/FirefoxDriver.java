package WebArch;

public class FirefoxDriver implements WebDriver{
	

	public FirefoxDriver(){
		System.out.println("Firefox launched");
	}
	
	
	@Override
	public void findElement(String element) {
		System.out.println("FirefoxDriver---->findElement: "+element);
		
	}

	@Override
	public void get(String url) {
		System.out.println("FirefoxDriver---->get the url: "+url);
		
	}

	@Override
	public String getTitle() {
		System.out.println("FirefoxDriver---->get the Title");
		
		return "Facebook";
	}

	@Override
	public void click(String element) {
		System.out.println("FirefoxDriver---->click on: "+element);
			
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("FirefoxDriver---->: Enter in "+element+" the value: "+value);
		
	}

	@Override
	public void close() {
		System.out.println("FirefoxDriver---->close");
	}


}
