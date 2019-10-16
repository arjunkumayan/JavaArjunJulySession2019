package javaSessions;

public class DataTypesConcept {

//	/*	g
//	g
//	g
//	g
//	g */
	
	
	/**
	 * 
	 * @author arjun singh
	 * this class to understand datatypes in java
	 * 
	 */
	
	public static void main(String[] args) {
// primitive data types: int, float, long, double, char, boolean
		// string - is non primitive
	// data types: what type of data you are using
		
		// 1. int: number 4 bytes 1 bytes = 8 bit
		//int= 4 bytes or 32bit
		// range: - 2147483648 to2147483648
		// all the keyword should start with small letter 
		// every keyword followed by character should end with semicolon;
		
		int i=10;
		// int i=30; duplicates variable are not allowed in java- type safety
		i=20;
		i=30;
		System.out.println(i);
		int j=-10;
		int k=20;
		int total=1000;
		int age=25;
		
		//2. byte= 1 byte  range -128 to 127
		byte b1=10;
		byte age1=21;
		
		//3 short =2 bytes range -32768 to 32767
		
		short s1=1299;
		
		//4 long = 8 bytes range:
		long l1=19029;
		
		//5 float : used to store decimal number 
		// 4 bytes
		
		float f1=12.33f;
		float f2= (float) 14.56;
		
		//6. double: 8 bytes
		// 
		
		double d1=12.56783;
		
		// 7. char: 2 bytes
		char c1='a';
		char c2='@';
		char c3='1';
		
				
		//8. boolean: not defined precisely
		//around 1 bytes
		
		boolean b3=true;
		boolean b2=false;
		
		//9. String is not a data type... its a class
		// collection of multiple characters
		String str="hellow world";
		System.out.println(str);
		
		
	}

}
