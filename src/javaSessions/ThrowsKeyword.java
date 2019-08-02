package javaSessions;

public class ThrowsKeyword {
	
	// method chaining

	// JVM will handle the error
	public static void main(String[] args) throws Exception {
		loginTest();
	}

	public static void loginTest() throws Exception
	{
		launchBrowser();
	}
	
	public static void launchBrowser() throws Exception
	{
		interactWithBrowser();
	}
	
	public static void interactWithBrowser() throws Exception
	{
		
		int i=9/0;
		/*try {
			int i=9/0;	
		}
		catch()
		{
			System.out.println("exceptin is coming");
		}*/
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
