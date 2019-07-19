package javaSessions;

public class StringReverse {
	
	public static String reverseWord(String word)
	{
		int len=word.length();
		String rev=" ";
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+word.charAt(i);
		}
		
		return rev;
			
	}

	public static void main(String[] args) {
		
		String str="Hello World Java";
		String str1[]=str.split(" ");
		
		for(int i=0;i<str1.length;i++)
		{
			String word=str1[i];
			String reverse=reverseWord(word);
			System.out.print(reverse+" ");
			
		}

	}

}
