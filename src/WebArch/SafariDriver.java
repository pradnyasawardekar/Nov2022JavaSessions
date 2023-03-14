package WebArch;

public class SafariDriver implements WebDriver{
	
	public SafariDriver(){
		System.out.println("Safari launched");
	}
	

	@Override
	public void findElement(String element) {
		System.out.println("SafariDriver---->findElement: "+element);
		
	}

	@Override
	public void get(String url) {
		System.out.println("SafariDriver---->get url: "+url);
		
	}

	@Override
	public String getTitle() {
		System.out.println("SafariDriver---->get the Title");
		
		return "Facebook";
	}

	@Override
	public void click(String element) {
		System.out.println("SafariDriver---->click on: "+element);
			
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("SafariDriver---->: Enter in "+element+" the value: "+value);
		
	}

	@Override
	public void close() {
		System.out.println("SafariDriver---->close");
	}

}
