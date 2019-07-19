package javaSessions;

public class StringAssignment {

	public static void main(String[] args) {
		String countryName[]=new String[5];
		 countryName[0]="India";
		 countryName[1]="Bangladesh";
		 countryName[2]="Nepal";
		 countryName[3]="UK";
		 countryName[4]="Japan";
		 
		 for(int i=0;i< countryName.length;i++)
		 {
			 if( countryName.equals("India"))
			 {
				 System.out.println( countryName[i]+" "+ "Country Captial Delhi");
			 }
			 else if( countryName.equals("Bangladesh"))
			 {
				 System.out.println( countryName[i]+" "+ "Contry capital Dhaka");
			 }
			 else if( countryName.equals("Nepal"))
			 {
				 System.out.println( countryName[i]+" "+ "Country capital Kathmandu");
			 }
			 else if( countryName.equals("UK"))
			 {
				 System.out.println( countryName[i]+" "+ "Country capital London");
			 }
			 else
			 {
				 System.out.println( countryName[i]+" "+"country capital Not defined");
			 }
		 }
		 

	}

}
