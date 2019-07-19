package javaSessions;

import java.util.ArrayList;

public class FunctionConcept {

	public static void main(String[] args) {
		
		
		//call the function
		// create an object of the class
		
		// new keyword
		
		FunctionConcept obj=new FunctionConcept();
		obj.test();
		obj.getCountryCapital("India");
		String s=obj.getTrainerName();
		System.out.println(s);
		
		obj.addition(10, 20);
		
		obj.getPlayersName();
		
		
		

	}
	
	public void test()
	{
		System.out.println("this is test method");
		
	}
	
	
	public void getMyCountry()
	{
		
		System.out.println("India");
	}

	
	public String getTrainerName()
	{
	String name="Naveen";
	return name;
		
	}
	
	public ArrayList<String> getPlayersName()
	{
		ArrayList<String> arr=new ArrayList<String>();
		
		arr.add("Arjun");
		arr.add("Sunil");
		return arr;
		
	}
	
	public String[] studentName()
	{
		String[] stu=new String[3];
		stu[0]="Arjun";
		stu[1]="Athiya";
		stu[2]="Rahul";
		return stu;
		
		
	}
	
	public int addition(int x,int y)
	{int z=x+y;
	return z;
		
	}

	public String getCountryCapital(String countryName)
	{
		
		System.out.println("getCountryCapital");
		
		if(countryName.equals("India"))
		{
			return "Delhi";
		}
		else if(countryName.equals("Russia"))
		{
			return "Moscow";
		}
		
		
		return null;
		
	}
	
	public boolean isUSCitizen(String personName)
	{
		
		System.out.println("isUSCitizent");
		if(personName.equals("Naveen"))
		{
			return false;
			
		}
		
		else if(personName.equals("Alina"))
		{
			return true;
		}
		
		return true;
		
	}
	
	public double getStudentMarks(String stuName)
	{
		System.out.println("Student marks");
		
		if(stuName.equals("Nisha"))
		{
			return 90;
		}
		
		else if(stuName.equals("Arjun"))
		{
			return 99.50;
		}
		
		else if(stuName.equals("Naveen"))
		{
			return 0;
		}
		
		else if(stuName.equals("Ravi"))
		{
			return 400;
		}
		
		else
		{
			System.out.println(stuName+" is not defined ");
		}
		
		return 0;
		
		
	}
	





















}
