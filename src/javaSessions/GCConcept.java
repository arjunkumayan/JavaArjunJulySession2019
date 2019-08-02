package javaSessions;

public class GCConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// recycling the unused object
		GCConcept g1=new GCConcept();
		g1=null;
		System.gc();// garbage collector
		// it will not give you complete guarantty that it will release the memory
				
		
	}
	@Override
	public void finalize()
	{
	System.out.println("hello");	
	}

}
