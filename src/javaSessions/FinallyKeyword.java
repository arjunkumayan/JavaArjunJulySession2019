package javaSessions;

public class FinallyKeyword {

	public static void main(String[] args) {
		
		/*try {
			int i=9/0;
		}
		
		// does not matter if exception coming or not
		finally {
			System.out.println("finally block");
		}
		*/
		
		
// finally without catch
		// try without catch possible but finally should be there
		int p=50;
		System.out.println("Going to run try block");
		try
		{
			int div=p/50;
			int div1=p/0;
		}
		catch(Exception e)
		{
			System.out.println("Some expeception");
			e.printStackTrace();
		}
		// catch block- to catch the exception				
		//System.out.println("Hello");
		// btween catch and finall -- finally should be written immediatel after catch block
		// what have written inside finally should be executed
		finally
		{
			System.out.println("exception coming or not");
		}
	}

}
