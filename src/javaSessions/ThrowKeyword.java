package javaSessions;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		// throw keyword is used to throw your own exception
		
		try {
			throw new Exception("NaveenException");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		// file not available exception
		
try {
	throw new Exception("FileNOTAVAILABLE Exception");
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
