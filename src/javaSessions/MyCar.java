package javaSessions;

public class MyCar {
// framework of my car
	// class variables
	String name;
	String colorName;
	String modelNumber;
	String engine;
	int price;
	double mileage;
	
	static int wheels=4;
	
	// class methods
	
	public void start()
	{
		
	}
	
	
	public void stop()
	{
		
	}
	
	public void refuelling()
	{
		
	}
	
	// template should be generic
	
	// constructor
	// it just like a function 
	// name remains as class name
	
	// purpose of constructor- use to initialize the object
	public MyCar() // 0 parameter constructor
	{
		System.out.println("Default constructor");
	// dont return any value	
	}
	// constructor- used to design the object
	// purpose-defining the object, giving the properties to object
	// dont write on logic on constructor
	// not return anything
	
	public MyCar(String name1,String model,String color,String engine,int price,double mileage)
	{
		name=name1;  // it is also correct but we have to maintain the different var name for local variables
		// with the help of this keyword I can use it 
		//this.class variable=local variable
		this.colorName=color;
		this.engine=engine;
		this.price=price;
		this.mileage=mileage;
		this.modelNumber=model;
		
		
	}
	
	public MyCar(int i)
	{
	
		System.out.println("1 param constructor");
		
	}
	
	
	
}
