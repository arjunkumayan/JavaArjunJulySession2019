package javaSessions;

public class ExceptionHandlingConcept {

	public static void main(String[] args) {

		System.out.println("A");
		
		try {
		int i=9/0;
		}
		// here Exception is the class
		catch(Exception e)
		{
			System.out.println("Some Exception occured");
			e.printStackTrace();
		}
		catch(Throwable e)
		{
			System.out.println("Some Exceptiono occured");
			e.printStackTrace();
		}
		
		
		
		/*catch(Error e)
		{
			System.out.println("Some Exception occured");
			e.printStackTrace();
		}*/
		
		System.out.println("B");
		
		// Exception- Try catch block
		
		// error and exception
		// error- syntax error -programming exception
		// stackoverflow- memory error
		
		
		
	}

}
