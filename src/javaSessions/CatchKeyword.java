package javaSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CatchKeyword {

	public static void main(String[] args) {
		
		Properties prop=new Properties();
		
		try {
			FileInputStream ip=new FileInputStream("");
			prop.load(ip);
		}
		
		catch (FileNotFoundException e) 
		{
		
			e.printStackTrace();
		
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
