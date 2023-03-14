package Oops_Constructor;

public class AssgnBrowser {
	
	String name;
	double version;
	String[] plugin;
	
	
	
	
	
	public AssgnBrowser(String name, double version, String[] plugin){
		
		this.name= name;
		this.version= version;
		this.plugin= plugin;
		
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public String[] getPlugin() {
		return plugin;
	}

	public void setPlugin(String[] plugin) {
		this.plugin = plugin;
	}

}
