package javaSessions;

public class LoopsConcept {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i=1;// initialize your variable
		while(i<=10)// conditional statement
		{
			System.out.println(i);
			i++;  // incremental part
			//i=i+1;
		}
		int k=1;
		while(k<=10)
		{
			System.out.println("Selenium"+" "+k);
		k=k+1;
		
		}
		
		
		//2. For loop
		
		for(int p=0;p<=10;p++)
		{
			//System.out.println("value of p="+p);
			for(int j=p;j<=p;j++)
			{
				System.out.print(j);
			}
		}
		
		for(int t=0;t<=10;t++)
		{
			
		}
		for(int even=2;even<10;even=even+2)
		{
			System.out.println(even);
		}
		
		for(int odd=1;odd<=9;odd=odd+2)
		{
			System.out.println(odd);
		}
		
		for(int s=1;s<=100;s++)
		{
			System.out.println(s);
			if(s==5)
			{
				System.out.println("Hey Buddy!!!");
			}
			if(s%5==0)
			{
				System.out.println("Hey Buddy 5!!!");
			}
		}

		
		
}}
