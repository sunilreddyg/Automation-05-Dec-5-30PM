package mq.java.constrcutor;

public class TestFacebook 
{
	//constructor [or] Class instance
	public TestFacebook() 
	{
		System.out.println("Browser is up and ready to use");
	}
	
	//Instance method
	public void verifytitle()
	{
		System.out.println("page title verified");
	}
	
	//Instance method
	public void verifyimage()
	{
		System.out.println("image is verified");
	}
	
	//static method
	public static void CheckBrowseropen()
	{
		System.out.println("Browser Verification Completed");
	}

	public static void main(String[] args) 
	{
		//Calling Instant methods using constructor name
		new TestFacebook().verifytitle();
		new TestFacebook().verifyimage();
		
		//Calling static methods using Class-name
		// Classname.methodname();
		TestFacebook.CheckBrowseropen();
		//Note:--> We can call direct with method name if your are in same class

	}

}
