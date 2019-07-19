package javaSessions;

public class StringReverse2 {
	
	public static void revStr(char a[])
	{
		int start=0;
		int end=a.length-1;
		char temp;
		while(start<end)
		{
			temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
			
		}
	}
	
	public static void print(char a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		
	}

	public static void main(String[] args) {
		String input="Hello";
		char str[]=input.toCharArray();
		revStr(str);
		print(str);
		
		
		
	}

}
