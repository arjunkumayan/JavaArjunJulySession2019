package javaSessions;

public class ArrayReverse {

	public static void reverseArray(int a[])
	{
		int begin=0;
		int len=a.length;
		int end= len-1;
				int temp;
		while(begin<end)
		{
			
			temp=a[begin];
			a[begin]=a[end];
			a[end]=temp;
			begin++;
			end--;
			
		}
		
		
	}
	
		
	public static void printArray(int a[])
	{
	
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		
	}
	
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		printArray(arr);
		System.out.println();
reverseArray(arr);
System.out.println();
printArray(arr);

	}

}
