package javaSessions;

public class MethodOverLoadingConcept {
// method overloading: within the class, having different methods with same
	// but different number of parameters
	// and different types of parameters

	
	// many+forms --> polymorphism
	
	// compile time polymorphism
	
	public void login()
	{
		System.out.println(" 0 param login method");
	}
	
	public void login(String username)
	{
		System.out.println("1 param with login method");
		
	}
	
	public void login(long phoneNumber)
	{
		System.out.println("1 param with long login method");
	}
	public void login(String email,String password)
	{
		System.out.println("2 param with login method");
	}
	
	public void login(String email,String password,String role)
	{
		System.out.println(" 3 params with login method");
		
	}
	
	public void login(int otp)
	{
		System.out.println("");
	}
	
	public void search(String product)
	{
		
	}
	
	public void search(String product, int price)
	{
		
	}
	
	public void search(String product, int price, String color)
	{
		
	}
	
	public void userRegistration(String email,String password,String phone)
	{
		
	}
	
	public void userRegistration(String add,String email,String password,String phone)
	{
		
	}
	
	
	public static void main(String[] args) {
		
		MethodOverLoadingConcept obj=new MethodOverLoadingConcept();
		obj.login(908);
	}

}
