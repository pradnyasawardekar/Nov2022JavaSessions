package WebArch;

public interface WebDriver extends SearchContext{
	
	//public void findElement(String element);
	public void get(String url);
	public String getTitle();
	public void click(String element);
	public void sendKeys(String element, String value);
	public void close();
	
}
