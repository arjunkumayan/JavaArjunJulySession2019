package javaSessions;

public class ArraysConcept {

	public static void main(String[] args) {
// two major limitations:
		// 1. static array: size is fixed
		//2. I can not store different data types: like student marks, id, subjects
		// to overcome this we use 1- object static array 2 - ArrayList - dynamic array
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i.length);
		
for(int k=0;k<i.length;k++)
{
	System.out.println(i[k]);
}

double d[]=new double[3];
d[0]=12.23;
d[1]=13.34;
d[2]=10;

int l=0;
while(l<d.length) {
	System.out.println(d[l]);
	l++;
	
}



String s[]=new String[4];
s[0]="java";
s[1]="python";
s[2]="Ruby";
s[3]="JavaScript";

for(int p=0;p<s.length;p++)
{
	if(s[p].equals("JavaScript"))
	{
	System.out.println("I hate "+s[p]);
}
	else {
		System.out.println("I Love "+s[p]);
	}

}


String stuName[]=new String[4];
stuName[0]="Inina";
stuName[1]="Nisha";
stuName[2]="Akshay";
stuName[3]="Sumi";

for(int count=0;count<stuName.length;count++)
{
	if(stuName[count].equals("Inina"))
	{
		System.out.println(stuName[count]+"she is Russian");
	}
	else if(stuName[count].equals("Sumi"))
	{
		System.out.println("She is from bangladesh");
	}
	else
	{
	System.out.println("stuName[count]"+" Student country is not defined");
}
	
	

}

// Object static Array:

Object empData[]=new Object[5];
empData[0]="Tom";
empData[1]="25";
empData[2]='m';
empData[3]=100.33;
empData[4]=true;





	}

}
