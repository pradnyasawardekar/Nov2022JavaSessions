package WebArch;

public class FBAppTest {
	
	static WebDriver driver=null;

	public static void main(String[] args) {
		
		//chrome
//		ChromeDriver ch= new ChromeDriver();
//		ch.get("www.facebook.com");
//		System.out.println("Title is : "+ch.getTitle());
//		ch.findElement("Friends");
//		ch.sendKeys("Textbox", "Hello Everyone");
//		ch.click("Post");
//		ch.close();

		System.out.println("_____________________________");
		//for in general u hv to topcast
		
		//WebDriver driver=null;
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("chrome")){
			 driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")){
			 driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("safari")){
			 driver = new SafariDriver();
		}
		else{
			System.out.println("Pls enter valid browser name");
		}
		
		driver.get("www.facebook.com");
			
		//Test case to validate the title
		String actualTitle = driver.getTitle();
		
		if (actualTitle.equals("Facebook")){
			System.out.println("Correct title: "+actualTitle);
		}
		else{
			System.out.println("Incorrect title: "+actualTitle);
		}
			
		
		driver.findElement("Friends");
		driver.sendKeys("Textbox", "Hello Everyone");
		driver.click("Post");
		driver.close();
				
	}

}
