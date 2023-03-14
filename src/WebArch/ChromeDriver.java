package WebArch;

public class ChromeDriver implements WebDriver{
	
	public ChromeDriver(){
		System.out.println("Chrome launched");
	}
	
	@Override
	public void findElement(String element) {
		System.out.println("ChromeDriver---->findElement: "+element);
		
	}

	@Override
	public void get(String url) {
		System.out.println("ChromeDriver---->get the url: "+url);
		
	}

	@Override
	public String getTitle() {
		System.out.println("ChromeDriver---->getting the Title");
		
		return "Facebook";
	}

	@Override
	public void click(String element) {
		System.out.println("ChromeDriver---->click on : "+element);
			
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("ChromeDriver---->: Enter in "+element+" the value: "+value);
		
	}

	@Override
	public void close() {
		System.out.println("ChromeDriver---->close");
	}

}
