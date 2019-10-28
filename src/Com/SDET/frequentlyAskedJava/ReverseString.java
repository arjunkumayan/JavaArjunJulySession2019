package Com.SDET.frequentlyAskedJava;

public class ReverseString {

	public static void main(String[] args) {
		
		//1 using + (String Concatenation) operator
		
		String str="Arjun";
		String rev=" ";
		
		
		int length=str.length();
		
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
						
		}
		
		System.out.println("The reverse number is= "+rev);
		
		// 2. using Character Array
		
		char a[]=str.toCharArray();
		int lenArray=a.length;
		String reverse=" ";
		
		
		for(int j=lenArray-1;j>=0;j--)
		{
			reverse=reverse+a[j];
		}
		System.out.println("Reverse using character Array= "+reverse);
		
		
		//3. /using StringBuffer
		
		
		//StringBuffer sb=StringBuffer(str);
				

	}

	private static StringBuffer StringBuffer() {
		// TODO Auto-generated method stub
		return null;
	}

}
