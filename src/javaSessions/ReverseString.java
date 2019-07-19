package javaSessions;

public class ReverseString {

	/*
	 * public static void revStr(String strng) { int len=strng.length(); int
	 * start=0; int end=len-1; int temp; for(int i=0,j=len-1;i<j;i++,j--) {
	 * swap(rev[i],rev[j]); }
	 * 
	 * 
	 * }
	 * 
	 * public static void rev(char a[],char b[]) {
	 * 
	 * }
	 */
	public static void main(String[] args) {
		
		String str="KUMAYAN";
		char st[]=str.toCharArray();
		int len=st.length;
		
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(st[i]);
			
		}

	}

}
