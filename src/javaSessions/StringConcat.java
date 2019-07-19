package javaSessions;

public class StringConcat {

	public static void main(String[] args) {
		
		int a=100;
		int b=200;
		String x="Hello";
		String y="World";
		
		System.out.println(a+b+x+y);
System.out.println(x+y+a+b);
System.out.println(x+y+(a+b));


System.out.println("the valueof  A"+a);
System.out.println("the value of B"+b);
System.out.println("the sum="+(a+b));
System.out.println("sum="+(x+y));


byte b1=100;
byte b2=25;
System.out.println(b1-b2);
System.out.println(b2-b1);
byte diff=(byte)(b1-b2); // 75 is int, it is considered as integer 
// 
System.out.println("diff is "+diff);

long l1=100;
long l2=300;
long l3=l2-l1;

int i1=10;
int i2=20;
int i3=i2-i1;
byte i4=(byte)(i2-i1);

char ch='a';
System.out.println("character count "+ch);

	}

}
