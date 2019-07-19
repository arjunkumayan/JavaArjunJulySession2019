package javaSessions;

public class CreateCar {

	public static void main(String[] args) {
		//MyCar obj=new MyCar();
		
		MyCar obj1=new MyCar(10);
		
		
		MyCar bmw=new MyCar("BMW","X3","White","Petrol",60,10.33);
		System.out.println(bmw.name);
		System.out.println(bmw.colorName);
		System.out.println(bmw.mileage+" "+bmw.price);
		System.out.println(bmw.modelNumber);
		
		// created the object of the class
		// creating the object the constructor will be calledand it depends on the te type of object you have create

		MyCar maruti=new MyCar("Maruti","Red","Alto","Petrol",4,20.33);
		System.out.println(maruti.colorName+" "+maruti.modelNumber+" "+maruti.engine+" "+maruti.mileage);
		// 
		MyCar audi=new MyCar("audi","Red","Q3","Diesel",50,7);
		System.out.println(audi.name+" "+audi.colorName+" "+audi.modelNumber+" "+audi.price);
		
	// class template will help us to write the framework
	}

}
