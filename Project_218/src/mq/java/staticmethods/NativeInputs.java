package mq.java.staticmethods;

public class NativeInputs 
{
	
	
	public static void mouse() 
	{
		System.out.println("mouse working");
	}
	
	
	public static void keyboard()
	{
		System.out.println("Keyboard working");
	}
	
	public static void touch()
	{
		System.out.println("touch working");
	}
	

	public static void main(String[] args) 
	{
		
		//Calling static methods with in Class
		//Syntax:-->  Call Directly using method name
		mouse();
		keyboard();
		touch();

	}

}
