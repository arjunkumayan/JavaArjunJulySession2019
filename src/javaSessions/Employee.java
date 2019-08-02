package javaSessions;

import java.util.ArrayList;

public class Employee {

	
	String name;
	int age;
	
	ArrayList<String> laptops;
	
	
	public Employee(String name,int age,ArrayList<String> laptops)
	{
	this.name=name;
	this.age=age;
	this.laptops=laptops;
	}
	
	
	
	public static void  main(String args[])
	{
		ArrayList<String> laptopList=new ArrayList<String>();
		laptopList.add("Mac book pro");
		laptopList.add("Windows laptop");
		laptopList.add("Macbook Air");
		laptopList.add("laptop lenovo");
		
		Employee emp1=new Employee("Tom",25,laptopList);
		
		System.out.println(emp1.age);
		System.out.println(emp1.laptops);
		
		System.out.println(emp1.name);
		
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(i+""+j+" ");
			}
			System.out.println();
		}
		
	}
}
