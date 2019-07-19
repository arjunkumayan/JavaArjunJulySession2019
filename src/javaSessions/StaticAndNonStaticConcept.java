package javaSessions;

public class StaticAndNonStaticConcept {

	public static void main(String[] args) {

		// how to call static methods: no need to create the objects
		//1. call by class name
		 
		
		StaticAndNonStaticConcept.getSchoolName();
		
		//2. call them directly 
		getSchoolName();
		
	// it will give you error-	StaticAndNonStaticConcept.getName();
	// diff in calling point of view
		
		// how to call non static methods: need to create the objects
		StaticAndNonStaticConcept obj=new StaticAndNonStaticConcept();
		obj.getName();
		obj.getSchoolName();
		
		
	}

	public void getName() {
		System.out.println("get Name method");
		
		getSchoolName();
		getAddress();
		
	}
	
	public void getAddress() {
		System.out.println("get Name method");
		
		
		
		
		
	}
	
	
// static method
	// how to call static method
	// memory management point of view
	public static void getSchoolName() {
		System.out.println("get School name method");
	}

}
